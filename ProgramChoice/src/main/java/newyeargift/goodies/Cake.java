package newyeargift.goodies;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public class Cake extends Sweet {
    private String firm;

    public Cake(String nameSweets, double price, double weight, String firm) {
        super(nameSweets, price, weight);
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    private void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return super.toString() + ", Firm = " + getFirm();

    }
}
