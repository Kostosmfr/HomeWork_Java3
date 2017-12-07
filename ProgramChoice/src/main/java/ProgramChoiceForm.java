import calculation.Calculation;
import minmaxinarray.*;
import minmaxinarray.Base;
import randomarray.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by K_PC-S on 07.12.2017.
 */
public class ProgramChoiceForm extends JFrame{
    private JButton searchMinMaxInArrayButton;
    private JButton calculateButton;
    private JButton randomArrayButton;
    private JButton newYearGiftButton;
    private JPanel Panel;


    public ProgramChoiceForm(){
        super("Choice Program");
        GUI();
    }

    public void GUI(){
        setContentPane(Panel);
        setSize(400,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Поиск максимального элемента в массиве
        searchMinMaxInArrayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //minmaxinarray.Base.main("MinMaxInArray");
                Base.main("Min Max In Array");
            }
        });

        //Калькулятор
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculation.main("Calculation");
            }
        });

        //Найти максимальный и минимальный элемент массива
        randomArrayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                randomarray.Base.main("Random Array");
            }
        });

        //Новогодний подарок
        newYearGiftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newyeargift.Base.main("New Year Gift");
            }
        });
    }

    public static void main(String[] args) {
        new ProgramChoiceForm();
    }

}
