package runner;

import models.Calculator;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(4, 3));
        System.out.println(Calculator.subtract(4, 3));
    }
}
