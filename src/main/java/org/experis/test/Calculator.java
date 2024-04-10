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

    //Getter e Setter
    public float getNum1(){
        return num1;
    }

    public void setNum1(float num1){
        this.num1 = num1;
    }

    public float getNum2(){
        return num2;
    }

    public void setNum2(float num2){
        this.num2 = num2;
    }

    // Metodi
    public float add(float num1, float num2){
        return num1 + num2;
    }

    public float subtract(float num1, float num2){
        return num1 - num2;
    }

    public float divide(float num1, float num2){
         return num1 / num2;
    }

    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
