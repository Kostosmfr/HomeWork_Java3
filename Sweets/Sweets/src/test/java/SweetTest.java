import org.junit.Test;
import org.junit.Assert;

import sweets.*;

import java.util.Iterator;

/**
 * Created by K_PC-S on 12.12.2017.
 */
public class SweetTest {

    //Есть подозрение, что так делать нельзя, т.к. используем открытое статическое поле класса, мы в любом случаем получим true
    @Test
    public void coefPrice() throws Exception {
        double price = 100.0;
        Sweet candy =  new Candy("Конфетки", price, 200, 99);
        Assert.assertEquals("Цена должна быть больше на 1%",price * Sweet.coefPrice, candy.getPrice(),0);
    }

    //Тут задаем и цену и коэф(на тот случай если коэф берется от куда нибудь(к примеру из БД) то сразу будет ясно почему упал тест
    @Test
    public void coefPriceTwo() throws Exception {
        double price = 100.0;
        double testCoefPrice = 1.001;
        Sweet candy =  new Candy("Конфетки", price, 200, 99);
        Assert.assertEquals("Цена должна быть больше на 1%",price * testCoefPrice, candy.getPrice(),0);
    }


    //проверить на коэф веса
    @Test
    public void coefWeight() throws Exception {
        double weight = 100.0;
        double testCoefWeight = 0.99;
        Sweet candy = new Candy("Конфетки", 99, weight, 10);
        Assert.assertEquals("Вес должен меньше на 1г за 100г", weight * testCoefWeight, candy.getWeight(),0);
    }

    //проверка на отрицательную сумму
    @Test(expected = Exception.class)
    public void negativePrice() throws Exception{
        double price = -100.00;
        Sweet cake = new Cake("Пиченьки", price, 100, "Firm");
    }

    //проверка на отрицательный вес
    @Test
    public void negativeWeight() throws Exception {
        double weigth = -1;
        Sweet chocolate;
        try {
            chocolate = new Chocolate("Шоколадка", 100, weigth, 0);
            Assert.fail("Expected java.lang.Exception");
        } catch (Exception e){
            Assert.assertEquals("Вес не может быть отрицательным", ""+e.getMessage());
        }
    }

    //проверка на пустой продукт
    @Test
    public void emptyGift() throws Exception {
        Sweet candy = new Candy();
        Assert.assertEquals("Подарок должен быть пустым", candy.getName(), "Пустой");
    }

    //проверка добавления продукта в пакет(считаем по индексам)
    @Test
    public  void testAddInPackage() throws Exception {
        Pack pack = new Pack();
        int lengthArrayExp = 2;
        if(pack.getIndex() == 0){
            pack.addSweetInPack(new Cake("Cakkke", 100 , 200 ,"Firma"));
            pack.addSweetInPack(new Cake("Cakkky", 200 , 300 ,"Firma"));
        }
        Assert.assertEquals("", lengthArrayExp, pack.getIndex());

    }

    //проверка на удаления продукта из пакета
    @Test
    public void testDeleteFromPackage() throws Exception{
        int lengthArrayExp = 1;
        Pack pack = new Pack();
        pack.addSweetInPack(new Cake("Cakkke", 100 , 200 ,"Firma"));
        pack.addSweetInPack(new Cake("Cakkky", 200 , 300 ,"Firma"));

        pack.deleteSweetFromPack(1);

        Assert.assertEquals(lengthArrayExp, pack.getIndex());


    }
}


