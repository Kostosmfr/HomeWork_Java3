package calculation;
import java.lang.ArithmeticException;

/**
 * Created by K_PC-S on 18.07.2017.
 */
public class OpDivision implements Operation {
    @Override
    public double calculate(double arg1, double arg2){
        if (arg2 == 0) { //обычная проверка
            System.out.println("Деление на ноль");
            return 0;
        }
        else
            return (arg1 / arg2);
    }
}
