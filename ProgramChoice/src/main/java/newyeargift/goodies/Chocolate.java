package newyeargift.goodies;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public class Chocolate extends Sweet {

    private int colories;

    public Chocolate(String name, double price, double weight, int colories) {
        super(name, price, weight);
        this.colories = colories;
    }

    public int getColories() {
        return colories;
    }

    private void setColories(int colories) {
        this.colories = colories;
    }

    @Override
    public String toString() {
        return super.toString() + ", Colories = " + getColories();

    }

}
