package calculation;

import java.util.Scanner;
/**
 * Created by K_PC-S on 18.07.2017.
 */
public class Calculation {

    public static void main(String[] args) {

        String s;
        boolean next = true;
        Scanner sc = new Scanner(System.in);
        MyOperationFactory myOpFactory = new MyOperationFactory();

        do {
            Input in = new Input(myOpFactory);
            in.inputParam();
            System.out.println("Продолжить? 'q' - выход, 'остальные символы' - продолжить");
            s = sc.next();
            if("q".equals(s)) next = false;
        } while (next);
        System.out.println("Выход");
    }
}
