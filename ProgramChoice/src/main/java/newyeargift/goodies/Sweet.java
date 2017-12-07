package newyeargift.goodies;

/**
 * Created by K_PC-S on 24.07.2017.
 */
public abstract class Sweet {
    private String name;
    private double price;
    private double weight;

    public Sweet(String name, double price, double weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", weight = " + getWeight() + ", price = " + getPrice();
    }
}
