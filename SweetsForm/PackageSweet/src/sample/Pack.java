package sample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by K_PC-S on 14.12.2017.
 */
public class Pack {

    ArrayList<Sweet> packOfSweets = new ArrayList<Sweet>();
    private double totalWeight = 0;
    private double totalPrice = 0;
    private Sweet sweet;


    public void addSweetInPack(Sweet sweet){
        packOfSweets.add(sweet);
        totalWeight += sweet.getWeight();
        totalPrice +=sweet.getPrice();
        System.out.println("Добавили " + sweet.getName());
        this.sweet = sweet;
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

    public String whatInThePackages(){
        //return (sweet.getName() + ": " + sweet.getPrice() + ", " + sweet.getWeight()+".");
        return  String.format("%s: %.1f, %.1f", sweet.getName(), sweet.getPrice(), sweet.getWeight());
    }

    public void mainCharacteristics(){
        System.out.println("Price: " + totalPrice + " Weight: " + totalWeight );
    }

    public String mainCharacteristic(){
        //return ("tPrice: " + totalPrice + ", tWeight: " + totalWeight );
        return String.format("tPrice: %.1f, tWeight: %.1f", totalPrice, totalWeight);
    }

    public int getIndex(){
        System.out.println("Размер массива = " + packOfSweets.size());
        return packOfSweets.size();
    }

    public Sweet getSweet(){
        return sweet;
    }
}
