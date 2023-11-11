package ShoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Person implements Identity {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new LinkedList<>();
    }

    public double getMoney() {
        return this.money;
    }

    private void setName(String name) {
        Validator.validateString(name);
        this.name = name;
    }

    private void setMoney(Double money) {
        Validator.validateValueNonNegative(money);
        this.money = money;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void buyProduct(Product product) {
        money -= product.getCost();
        this.products.add(product);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, products.isEmpty() ? "Nothing bought" : products.stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
