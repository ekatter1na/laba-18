package com.metanit;

import java.util.Scanner;

class Calculate{
    private static Calculate calcul= new Calculate();
    private double x;
    private double y;
    private Calculate() {
    }
    public static Calculate getInstanse(){
        return calcul;
    }
    public double counting() {
        return 2 * x + 3 / y;
    }
    
    public void setChicel(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculate calcul = Calculate.getInstanse();
        Scanner i = new Scanner(System.in);
        System.out.println("Введите значение x");
        double x= i.nextDouble();
        System.out.println("Введите значение y");
        double y = i.nextDouble();
        calcul.setChicel(x, y);
        System.out.println("2*x+3/y= " + calcul.counting());
    }
}
