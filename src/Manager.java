public class Manager extends Employee {

    //abstract classi miras alan ve methodlari override eden class
    private String departmant;

    //constructor
    public Manager(String name, int age, int id, double salary, String departmant) {
        super(name, age, id, salary);
        this.departmant = departmant;
    }

    //getter-setter
    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager ID: "+ getId());
        System.out.println("Manager name: "+ getName());
        System.out.println("Manager age: "+ getAge());
        System.out.println("Manager salary: "+ getSalary());
        System.out.println("Department : "+ departmant);

    }
    //toString


    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "departmant='" + departmant + '\'' +
                '}';
    }
}
