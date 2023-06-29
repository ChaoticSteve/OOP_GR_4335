package Interfaces;

import Classes.ComplexNumber;

public interface iComplexCalculable {
    iComplexCalculable sum(ComplexNumber arg);
    iComplexCalculable multi(ComplexNumber arg);
    iComplexCalculable divide(ComplexNumber arg);
    ComplexNumber getResult();
}
