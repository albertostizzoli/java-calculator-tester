package org.experis.test;

public class Calculator {
    //Attributi
    private float num1;
    private float num2;

    //Costruttore
    public Calculator(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // Metodi
    public float add(float num1, float num2){
        return num1 + num2;
    }

    public float subtract(float num1, float num2){
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws IllegalArgumentException{
        if (num2 == 0){
            throw new IllegalArgumentException("Il numero non si può dividere per 0");
        }
         return num1 / num2;
    }

    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
