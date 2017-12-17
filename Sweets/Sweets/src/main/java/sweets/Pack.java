package sweets;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by K_PC-S on 14.12.2017.
 */
public class Pack {

ArrayList<Sweet> packOfSweets = new ArrayList<Sweet>();
private double totalWeight = 0;
private double totalPrice = 0;


    public void addSweetInPack(Sweet sweet){
        packOfSweets.add(sweet);
        totalWeight += sweet.getWeight();
        totalPrice +=sweet.getPrice();
        System.out.println("Добавили " + sweet.getName());
    }

    //Удаление по индексу(учитывать динамический массив)
    public void deleteSweetFromPack(int index){
    Iterator<Sweet> iter = packOfSweets.iterator();
        if(packOfSweets.isEmpty()){ System.out.println("Пакет пустой");}
        else {
            while (iter.hasNext()) {
                Sweet s = iter.next();

                if (packOfSweets.indexOf(s) == index) {
                    totalWeight -= s.getWeight();
                    totalPrice -= s.getPrice();
                    System.out.println("Удалили " + s.getName());
                }
            }
            packOfSweets.remove(index);
        }
    }

    public void whatInThePackage(){
        for (Sweet i: packOfSweets
             ) {
            System.out.println(packOfSweets.indexOf(i) + ": "+ i.getName() + " - "+ i.toString());
        }
    }

    public void mainCharacteristics(){
        System.out.println("Price: " + totalPrice + " Weight: " + totalWeight );
    }

    public int getIndex(){
        System.out.println("Размер массива = " + packOfSweets.size());
        return packOfSweets.size();
    }
}
