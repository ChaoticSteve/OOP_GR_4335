package Classes;


import Interfaces.iComplexCalculable;

public class ComplexCalculator  implements iComplexCalculable {
    private ComplexNumber primaryArg;
    public ComplexCalculator(ComplexNumber primaryArg){this.primaryArg = primaryArg;}
    public ComplexCalculator sum(ComplexNumber arg){
        double a = primaryArg.getA() + arg.getA();
        double b = primaryArg.getB() + arg.getB();
        this.primaryArg = new ComplexNumber(a, b);
        return this;
    }
    public ComplexCalculator multi(ComplexNumber arg) {
        double a = (primaryArg.getA() * arg.getA()) - (primaryArg.getB() * arg.getB());
        double b = (primaryArg.getB() * arg.getA()) + (primaryArg.getA() * arg.getB());
        this.primaryArg = new ComplexNumber(a, b);
        return this;
    }
    public ComplexCalculator divide(ComplexNumber arg) {
        if (arg.getA() == 0 && arg.getB() == 0) {
            System.out.println("Введён не верный делитель!");
        } else {
            double a = ((primaryArg.getA() * arg.getA()) + (primaryArg.getB() * arg.getB())) / ((arg.getA() * arg.getA()) + (arg.getB() * arg.getB()));
            double b = ((primaryArg.getB() * arg.getA()) - (primaryArg.getA() * arg.getB())) / ((arg.getA() * arg.getA()) + (arg.getB() * arg.getB()));
            this.primaryArg = new ComplexNumber(a, b);
        }
        return this;
    }

    public ComplexNumber getResult(){
        return primaryArg;
    }
}
