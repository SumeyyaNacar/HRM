import java.util.List;

public interface IPersonService {
    //Personel islemlerini tanimlayan arayuz

     void addPerson(Person person);

    void removePerson(int id);

    List<Person> displayAllPerson();


}
