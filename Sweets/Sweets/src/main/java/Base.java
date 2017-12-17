
import sun.plugin.javascript.navig.Array;
import sweets.*;

import java.util.Arrays;

/**
 * Created by K_PC-S on 04.07.2017.
 */
public class Base {

    public static void main(String[] args) throws Exception {

        System.out.println("Проверка 1");
        Pack pack = new Pack();
        pack.addSweetInPack(new Candy("Candyyyy",100,100,10));

        pack.whatInThePackage();

        pack.addSweetInPack(new Cake("Cakkke", 100 , 200 ,"Firma"));
        pack.addSweetInPack(new Cake("Cakkky", 200 , 300 ,"Firma"));

        pack.whatInThePackage();

        pack.mainCharacteristics();

        pack.getIndex();

        pack.whatInThePackage();
        pack.deleteSweetFromPack(2);
        pack.whatInThePackage();
        pack.deleteSweetFromPack(0);
        pack.whatInThePackage();
        pack.deleteSweetFromPack(0);
        pack.whatInThePackage();



        pack.mainCharacteristics();
        pack.deleteSweetFromPack(0);
    }
}
