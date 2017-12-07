package minmaxinarray;

import java.util.Scanner;

/**
 * Created by K_PC-S on 26.06.2017.
 */


public class Input {

    Scanner sc = new Scanner(System.in); //Для ввода с консоли

    int stringLen; //Максимальное количество слов(для массива)
    /**
     * Конструктор вызывается в классе Loop
     */
    public Input(){

            InputArray();


    }

    /**
     * Ввод данных с консоли, а именно длина массива(кол-во слов) для дальнейшей работы
     * Проверка ввода не осуществляется т.к. все String
     */
    public void InputArray(){
        System.out.println("Введите кол-во слов");
        stringLen = sc.nextInt();

        ArrayElemLen ael = new ArrayElemLen(stringLen);
    }



}
