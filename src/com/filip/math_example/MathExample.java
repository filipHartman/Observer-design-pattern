package com.filip.math_example;

class MathExample {
    public static void main(String[] args) {
        ObervableNumber obervableNumber = new ObervableNumber();

        AdditionNumberObserver additionNumberObserver = new AdditionNumberObserver();
        obervableNumber.addNumberObserver(additionNumberObserver);

        SubtractionNumberObserver subtractionNumberObserver = new SubtractionNumberObserver();
        obervableNumber.addNumberObserver(subtractionNumberObserver);

        obervableNumber.changeNumber(8);
        System.out.println(additionNumberObserver.number);
        System.out.println(subtractionNumberObserver.number);

        obervableNumber.changeNumber(-147);
        System.out.println(additionNumberObserver.number);
        System.out.println(subtractionNumberObserver.number);

        obervableNumber.changeNumber(16);
        System.out.println(additionNumberObserver.number);
        System.out.println(subtractionNumberObserver.number);

    }
}
