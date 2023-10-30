public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary = this.salary + ((this.salary * bonus / 100 / 2));
        } else {
            this.salary = this.salary + (this.salary * bonus / 100);
        }
    }

    @Override
    public String toString() {

        return String.format("%s %s gets %f leva", getFirstName(), getLastName(), getSalary());
    }
}
