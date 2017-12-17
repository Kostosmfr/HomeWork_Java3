package sweets;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public class Candy extends Sweet {

    private int sugar;

    public Candy(String nameSweets, double price, double weight, int sugar) throws Exception {
        super(nameSweets, price, weight);
        this.sugar = sugar;
    }

    public Candy() throws Exception {
        super();
        this.sugar = 0;
    }

    public int getSugar() {
        return sugar;
    }

    private void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sugar = " + getSugar();

    }
}
