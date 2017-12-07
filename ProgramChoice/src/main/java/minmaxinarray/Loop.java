package minmaxinarray;

import java.util.Scanner;
/**
 * Created by K_PC-S on 26.06.2017.
 */
public class Loop{
    String s; //Продолжить или выйти
    Scanner sc = new Scanner(System.in);

    /**
     * Цикл выполнения задач
     * Выход по клавише 'q' после соответствующего ввода
     */
    public Loop(){
        while(true){
            System.out.println("\nРабота с массивом");

            System.out.println("Продолжить? 'q' - выход, 'остальные символы' - продолжить");
            s = sc.next();
            if("q".equals(s)) break;

            Input in = new Input();
        }

        System.out.println("Выход");
    }

}
