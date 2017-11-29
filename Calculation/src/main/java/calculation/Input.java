package calculation;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by K_PC-S on 18.07.2017.
 */
public class Input {
    String operationString;
    char operation;
    double arg1, arg2;
    MyOperationFactory myOpFactory;
    Scanner sc = new Scanner(System.in);

    public Input(MyOperationFactory myOpFactory){
        this.myOpFactory = myOpFactory;
    }

    /**
     * Ввод данный с консоли
     */
    public void inputParam(){
        System.out.println("Введите операцию");

        operationString = sc.next();
        if (String.valueOf(this.operationString.charAt(0)).matches("[-,+,*,/]+")) {
            this.operation = operationString.charAt(0);

            Operation op = myOpFactory.getOperation(operation);

            System.out.println("Введите числа");
            System.out.print("Первое число ");
            this.arg1 = sc.nextDouble();
            System.out.print("Второе число ");
            this.arg2 = sc.nextDouble();
            System.out.println("");

            System.out.printf("Результат операции " + getOperation() + " равняется %.4f\n", op.calculate(this.arg1, this.arg2));

        }
        //!Тут выскакивает окно с ошибкой! Но может не выскочить по верх IDE!
        else if(String.valueOf(this.operationString.charAt(0)).matches("[a-z,A-z,0-9,'@!#%$;№=_^]+")){
/*            JOptionPane.showMessageDialog(new JFrame(),
                    new NumberFormatException("\nДолжны быть операции +, -, * или /\n"+ "Дальнейшие расчеты не верны!"),
                    "Ошибка", JOptionPane.ERROR_MESSAGE);*/
            System.out.printf("Должны быть операции +, -, * или /. " + "Дальнейшие расчеты не верны!\n");
        }
    }

    public char getOperation(){
        return operation;
    }
}
