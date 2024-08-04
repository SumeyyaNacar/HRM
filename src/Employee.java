public class Employee extends Person{

    //abstract classi miras alan ve methodlari override eden class

    private double salary;

    //Cosntructor
    public Employee(String name, int age, int id, double salary) {
        super(name, age, id);
        this.salary = salary;
    }
    //getter-setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void displayDetails() {
        System.out.println("Employee ID: "+ getId());
        System.out.println("Employee name: "+ getName());
        System.out.println("Employee age: "+ getAge());
        System.out.println("Employee salary: "+ getSalary());

    }
    //toString

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "salary=" + salary +
                '}';
    }
}
