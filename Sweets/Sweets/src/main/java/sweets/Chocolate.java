package sweets;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public class Chocolate extends Sweet {

    private int colories;

    public Chocolate(String name, double price, double weight, int colories) throws Exception {
        super(name, price, weight);
        this.colories = colories;
    }

    public Chocolate() throws Exception {
        super();
        this.colories = 0;
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
