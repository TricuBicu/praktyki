package Zadanka;


import java.util.Scanner;

public class Zad5 {

    public static void funkcja(double a, double b){
        if (a <= 0){
            System.out.println("brak miejsca zerowego. Funkcja jest stała");
        }
        else   {
            double x = - (b / a);
            System.out.println("Miejscem zerowym funkcji jest:" + x);
        }
    }

    public static void main(String[] args2) {

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Podaj: a");
        double a = scanner.nextDouble();
        System.out.println("Podaj: b");
        double b = scanner.nextDouble();

        funkcja(a , b);


    }
}