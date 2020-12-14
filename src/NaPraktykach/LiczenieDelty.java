package NaPraktykach;

import java.util.Scanner;

public class LiczenieDelty {

    public static double Ldelty(double a, double b, double c){

        Double delta = b*b - 4 * a * c;
        System.out.println("delta wynosi: "+ delta);

        return delta;
    }

    public static void Lxow(double delta, double a, double b){

        if (delta == 0){
            Double x0 = -b/(2*a);
            System.out.println("x0 wynosi: " + x0);
        }
        else   if(delta > 0){
            Double x1 = (-b + Math.sqrt(delta))/ (2*a);
            Double x2 = (-b - Math.sqrt(delta))/ (2*a);

            System.out.println("x1  wynosi: " +x1 );
            System.out.println("x2  wynosi: " +x2);
        }
        else if (delta < 0){
            System.out.println("Brak rozwiązań");
        }

    }



    public static void main(String[] args2) {
        //    int x = 8;
        //    Math.pow(x, 10) do potęg itd
        //b*b -4*a*c
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj: a");
        double a = scanner.nextDouble();
        System.out.println("Podaj: b");
        double b = scanner.nextDouble();
        System.out.println("Podaj: c");
        double c = scanner.nextDouble();

        double delta = Ldelty(a,b,c);

        Lxow(delta,a,b);


        double delta1 = Ldelty(4,5,1);

        Lxow(Ldelty(4,5,1),4,5);

    }
}