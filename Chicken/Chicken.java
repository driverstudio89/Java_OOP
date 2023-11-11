package Chicken;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (validateAge(age)) {
            this.age = age;
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (getAge() < 6) {
            return 2;
        } else if (getAge() < 12) {
            return 1;
        }
        return 0.75;
    }

    private boolean validateName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        return true;
    }
    private boolean validateAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Chicken.Chicken Chichi (age %d) can produce %.2f eggs per day.", age, calculateProductPerDay());
    }
}
