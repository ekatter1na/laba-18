package com.metanit;

import java.util.Scanner;

public class Main {
    public static final class Calculate{
        private static Main.Calculate calcul = null;
        private double x;
        private double y;

        private Calculate() {
            this.x = x;
            this.y = y;
        }

        public synchronized Main.Calculate getInstance() {
            if (calcul == null)
                calcul = new Main.Calculate();
            return calcul;
        }
        public void prim(double x,double y){
            double result = (2*x+3)/y;
            System.out.println("результат: " + result);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("введите x:");
            double x = in.nextDouble();
            System.out.println("введите y:");
            double y = in.nextDouble();
            Calculate calk = new Calculate();
            calk.prim(x,y);
        }

    }

}