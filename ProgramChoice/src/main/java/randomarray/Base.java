package randomarray;


/**
 * Created by K_PC-S on 03.07.2017.
 */
public class Base {
    public static void main(String args) {
        //Для удобства выводим индексы массива
        System.out.println("\nИндексы массива");
        for(int i = 0; i<20;i++){//Так не хорошо делать
            System.out.printf("0%-2s%1s", i, "");
        }

        //Проверка работы с одним объектом

        Generate g = new Generate();
        g.genarationRandomArray();
        g.getArray();
        g.swapMinMaxInArray();
        g.getArray();

        //Проверка работы с массивом объектов
        /*
        Generate[] gArray = new Generate[5];
        for(int i = 0; i < gArray.length;i++){
            gArray[i] = new Generate();
            gArray[i].genarationRandomArray();
            gArray[i].getClass();
            gArray[i].swapMinMaxInArray();
            gArray[i].getArray();
        }
        */
    }
}
