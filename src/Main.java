import java.util.Scanner;

public class Main {
    //kullanicinin etkilesimini yoneten class
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Scanner scanner = new Scanner(System.in);

        start(personService, scanner);

        scanner.close();

    }

    private static void start(PersonService personService, Scanner scanner) {

        int select;
        do {
            System.out.println("*** Insan Kaynaklari Yonetim Sistemine Hos Geldiniz ***");
            System.out.println("Yapmak istediginiz islemi secin...");
            System.out.println("1-Personel Ekleme");
            System.out.println("2-Personel Silme");
            System.out.println("3-Personel Lİstele");
            System.out.println("0-Cikis");
            System.out.print("Seciminiz : ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.print("Personel turu secin (1-Calisan, 2-Yonetici) : ");
                    int selection= scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Isim : ");
                    String name=scanner.nextLine();

                    System.out.print("Yas : ");
                    int age = scanner.nextInt();

                    System.out.print("ID : ");
                    int id= scanner.nextInt();

                    System.out.print("Maas : ");
                    double salary = scanner.nextInt();
                    scanner.nextLine();

                    if (selection==1){
                        Employee employee= new Employee(name,age, id,salary);
                        personService.addPerson(employee);
                    }else {
                        System.out.print("Bolum : ");
                        String departmant = scanner.nextLine();
                        Manager manager = new Manager(name,age,id,salary,departmant);
                        personService.addPerson(manager);

                    }
                    break;
                case 2:
                    System.out.print("Silmek istediginiz personel id girin: ");
                    int removedId = scanner.nextInt();
                    personService.removePerson(removedId);
                    break;

                case 3:
                    for (Person person: personService.displayAllPerson()){
                        person.displayDetails();
                        System.out.println("-------------------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Tesekkur eder, yine bekleriz...");
                    break;
                default:
                    System.out.println("Hatali Giris!!!");
            }

        }while (select!=0);
    }


}
