package View;

import Classes.ComplexCalculator;
import Classes.ComplexNumber;
import Interfaces.iComplexCalculable;
import Interfaces.iView;

import java.util.Locale;
import java.util.Scanner;

public class ViewComplexCalculator implements iView {
    private iComplexCalculable calc;
    public ViewComplexCalculator(iComplexCalculable calc){
        this.calc = calc;
    }
    @Override
    public void run() {
        boolean run = true;
        while (run){
            System.out.println("Это калькулятор для комплексных чисел вида a + bi");
            ComplexNumber primaryArg = new ComplexNumber(promptDouble("Введите первое вещественное а:"),promptDouble("Введите второе вещественное b:"));
            calc.sum(primaryArg);
            boolean start = true;
            while (start){
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("+")) {
                    ComplexNumber arg = new ComplexNumber(promptDouble("Введите первое вещественное а:"),promptDouble("Введите второе вещественное b:"));
                    calc.sum(arg);
                }
                if (cmd.equals("*")) {
                    ComplexNumber arg = new ComplexNumber(promptDouble("Введите первое вещественное а:"),promptDouble("Введите второе вещественное b:"));
                    calc.multi(arg);
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = new ComplexNumber(promptDouble("Введите первое вещественное а:"),promptDouble("Введите второе вещественное b:"));
                    calc.divide(arg);
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calc.getResult();
                    System.out.printf("Результат %s", result);
                    start = false;
                }
            }
            String cmd = prompt("\nЕще посчитать (Y/N)?").toLowerCase();
            if (cmd.equals("n")) {
                run = false;
            }

        }

    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

}
