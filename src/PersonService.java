import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService implements IPersonService {
    //Interface implement edip methodlari override eden class

    private List<Person> personList;
    PersonService personService;

    //constr
    public PersonService() {
        this.personList = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Personel turu secin (1-Calisan, 2-Yonetici) : ");
        int select= scanner.nextInt();
        System.out.println();
        System.out.print("Isim : ");
        String name=scanner.nextLine();
        System.out.println("Yas : ");
        int age = scanner.nextInt();
        System.out.println("ID : ");
        int id= scanner.nextInt();
        System.out.println("Maas : ");
        double salary = scanner.nextInt();
        if (select==1){
            Employee employee= new Employee(name,age, id,salary);
            personService.addPerson(employee);
        }else {
            System.out.println("Bolum : ");
            String departmant = scanner.nextLine();
            Manager manager = new Manager(name,age,id,salary,departmant);
            personService.addPerson(manager);

        }






        personList.add(person);

    }

    @Override
    public void removePerson(int id) {
        personList.remove(id);
    }

    @Override
    public List<Person> displayPerson() {
        return personList;
    }

}
