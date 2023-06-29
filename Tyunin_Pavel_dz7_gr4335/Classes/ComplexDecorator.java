package Classes;


import Interfaces.iComplexCalculable;

public class ComplexDecorator implements iComplexCalculable {
    private ComplexCalculator calculator;
    private Logger logger;
    public ComplexDecorator(ComplexCalculator calculator, Logger logger){
        this.calculator = calculator;
        this.logger = logger;
    }
    public iComplexCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        //logger.log(firstArg.toString());
        iComplexCalculable result = calculator.sum(arg);
        logger.log(String.format("(%s) + (%s)", firstArg, arg));
        return result;
    }

    @Override
    public iComplexCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(firstArg.toString());
        iComplexCalculable result = calculator.multi(arg);
        logger.log(String.format("(%s) * (%s)", firstArg, arg));
        return result;
    }

    @Override
    public iComplexCalculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(firstArg.toString());
        iComplexCalculable result = calculator.divide(arg);
        logger.log(String.format("(%s) / (%s)", firstArg, arg));
        return result;
    }

    public ComplexNumber getResult(){
        logger.log(String.format("= (%s)", calculator.getResult()));
        return this.calculator.getResult();
    }
}
