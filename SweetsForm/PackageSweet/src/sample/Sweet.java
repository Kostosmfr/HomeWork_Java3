package sample;

/**
 * Created by K_PC-S on 24.07.2017.
 */
public class Sweet {
    private String name;
    private double price;
    private double weight;
    //Вводим поправочный коэф(тип обертка\упаковка весит 1г на 100г продукта)
    private double coefWeight = 0.99;
    //Прибавляем 1% от полной цены
    public static double coefPrice = 1.001;

    public Sweet(String name, double price, double weight) throws Exception {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public Sweet() throws Exception {
        setName("Пустой");
        setPrice(0.0);
        setWeight(0.0);
        System.out.println("Товар пустой");

    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) throws Exception {
        if(price<0){
            throw new Exception("Мы не можем заплатить за товар покупателя!");
        }
        //Прибавляем пару копееек(У нас ведь в рублях?)
        this.price = price * coefPrice;
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

    private void setWeight(double weight) throws Exception {
        if(weight<0){
            throw new Exception("Вес не может быть отрицательным");
        }
        this.weight = weight * coefWeight;
    }

    @Override
    public String toString() {
        return "Weight = " + getWeight() + ", price = " + getPrice();
    }
}
