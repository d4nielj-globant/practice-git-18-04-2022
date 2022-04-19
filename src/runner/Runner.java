package runner;

import models.Calculator;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(4, 3));
        System.out.println(Calculator.subtract(4, 3));
        System.out.println(Calculator.multiply(5,0));
        System.out.println(Calculator.multiply(5,2));
        System.out.println(Calculator.divide(15, 3));
        try {
            System.out.println(Calculator.divide(5, 0));
        } catch (Exception e) {
            System.out.println("Please not divide by 0, thank you.");
        }
    }
}
