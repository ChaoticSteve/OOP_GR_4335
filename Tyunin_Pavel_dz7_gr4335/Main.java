import Classes.*;
import Interfaces.iCalculable;
import Interfaces.iComplexCalculable;
import Interfaces.iView;
import View.ViewCalculator;
import View.ViewComplexCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       chooseMode().run();
    }

    private static iView chooseMode() {
        Logger logger = new Logger();
        Scanner in = new Scanner(System.in);
        System.out.print("Выбери режим\n\t1-целые числа\n\t2-комлексные числа\n>>>");
        String choose = in.nextLine();
        if (choose.equals("2")) {
            ComplexCalculator calc1 = new ComplexCalculator(new ComplexNumber(0, 0));
            iComplexCalculable calc = new ComplexDecorator(calc1, logger);
            return new ViewComplexCalculator(calc);
        }
        iCalculable calculator = new CalcDecorator(new Calculator(0), logger);
        return new ViewCalculator(calculator);
    }
}