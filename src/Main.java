import java.util.Scanner;

public class Main {
    //kullanicinin etkilesimini yoneten class
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Scanner scanner = new Scanner(System.in);
        Person person;
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
                    personService.addPerson();

            }







        }while (select!=0);
    }


}
