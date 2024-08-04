import java.util.Scanner;

public class Main {
    //kullanicinin etkilesimini yoneten class
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Scanner scanner = new Scanner(System.in);

        start(personService, scanner);

    }

    private static void start(PersonService personService, Scanner scanner) {

        int select;
        do {
            System.out.println("*** Sirket Yonetim Sistemine Hos Geldiniz ***");
            System.out.println("Yapmak istediginiz islemi secin...");
            System.out.println("1-Personel Ekleme");
            System.out.println("2-Personel Silme");
            System.out.println("3-Personel Lİstele");
            System.out.println("0-Cikis");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.print("Personel turu secin (1-Calisan, 2-Yonetici) : ");
                    int selection= scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Isim : ");
                    String name=scanner.nextLine();

                    System.out.println("Yas : ");
                    int age = scanner.nextInt();

                    System.out.println("ID : ");
                    int id= scanner.nextInt();

                    System.out.println("Maas : ");
                    double salary = scanner.nextInt();
                    scanner.nextLine();

                    if (selection==1){
                        Employee employee= new Employee(name,age, id,salary);
                        personService.addPerson(employee);
                    }else {
                        System.out.println("Bolum : ");
                        String departmant = scanner.nextLine();
                        Manager manager = new Manager(name,age,id,salary,departmant);
                        personService.addPerson(manager);

                    }
                    break;
                case 2:
                  
                case 3:
                    for (Person person: personService.displayAllPerson()){
                        person.displayDetails();
                    }
                    break;
            }







        }while (select!=0);
    }


}
