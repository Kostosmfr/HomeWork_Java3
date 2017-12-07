package randomarray;

/**
 * Created by K_PC-S on 03.07.2017.
 */

import java.util.Random;

public class Generate {
    Random random = new Random();

    int[] randomArray = new int[20];

    /**
     * Заполнение массива случайными числами от -10 до 10
     */
    public void genarationRandomArray(){
        System.out.print("\nЗаполняем массив случайными числами от -10 до 10");
        for(int i=0;i<randomArray.length;i++){
            randomArray[i] = random.nextInt(21)-10;
        }
        System.out.println();
    }

    /**
     * Вывод массива на консоль
     */
    public void getArray(){
        for(int i = 0; i <randomArray.length;i++){
            System.out.printf("%-3s%1s",randomArray[i],"");
        }
        System.out.println();
    }

    /**
     * Поиск min и max числа в массиве и замена их друг на друга
     */
    public void swapMinMaxInArray(){
        int imin = 0, imax = 0, max = 0;
        for(int i = 0; i<randomArray.length;i++){
            if(randomArray[i]>randomArray[imax]) {
                imax = i;
                max = randomArray[imax];
            }else if(randomArray[i]<randomArray[imin])
                imin = i;
        }
        randomArray[imax] = randomArray[imin];
        randomArray[imin] = max;
        System.out.printf("Поменяли местами randomArray[%2s] с randomArray[%2s](Максимальное число %2s, минимальное %3s)%n", imax,imin, max, randomArray[imax]);

    }

}
