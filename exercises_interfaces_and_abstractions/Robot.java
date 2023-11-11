package exercises_interfaces_and_abstractions;

public class Robot implements Identifiable{

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
