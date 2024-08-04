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
        personList.add(person);

    }

    @Override
    public void removePerson(int id) {
       personList.removeIf(person -> person.getId()==id);
    }

    @Override
    public List<Person> displayAllPerson() {
       return personList;
    }

}
