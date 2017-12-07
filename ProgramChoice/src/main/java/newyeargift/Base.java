package newyeargift;

import newyeargift.goodies.*;

/**
 * Created by K_PC-S on 04.07.2017.
 */
public class Base {

    public static void main(String args) {

        double totalWeight = 0;
        double totalPrice = 0;

        Sweet[] sw = new Sweet[5];
        sw[0] = new Candy("Fly", 87.34, 200.00, 99);
        sw[1] = new Candy("Cow", 104.55, 250.00, 150);
        sw[2] = new Cake("CheeseCake", 1400.00, 500.00, "Awesome Cake");
        sw[3] = new Cake("Banopard", 1859.99, 400, "Napoleon");
        sw[4] = new Chocolate("Milka", 256.89, 500.00, 359);

        System.out.println("\nGift content:");
        for (int i = 0; i < sw.length; i++) {
            totalWeight += sw[i].getWeight();
            totalPrice += sw[i].getPrice();
            if (i == sw.length - 1) {
                System.out.print(sw[i].getName() + ";");
            } else System.out.print(sw[i].getName() + ", ");
        }
        System.out.printf("\nTotal weight of the gift %.2f%n", totalWeight);
        System.out.printf("Total amount of the gift %.2f%n", totalPrice);
    }
}
