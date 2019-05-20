package com.kodilla;


class Application{
    public static void main(String[] args){

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();

        double result1 = calculator1.add(10.14,10.13);

        System.out.println("The result of add is: " + result1);

        double result2 = calculator2.substracting(13.9,15.45);

        System.out.println("The result of substracting is: " + result2);
    }
}

class Calculator {

    public static Double add(Double numberA, Double numberB) {

        return numberA + numberB;
    }

    public static Double substracting(Double numberA, Double numberB) {

        return numberA - numberB;
    }
}







