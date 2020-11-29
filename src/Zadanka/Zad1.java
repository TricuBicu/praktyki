package Zadanka;

public class Zad1 {
    public static void main(String[] args) {

        System.out.println("Liczby Parzyste");

        int i = 0;

        System.out.println("Pętla for");
        for (i = 0; i < 10; i++)
            System.out.println("Liczba " + i + " jest " + (i % 2 == 0 ? "parzysta" : "nieparzysta"));

        System.out.println("Pętla while");
        i=0 ;
        while ((i++) < 10) {
            System.out.println("Liczba " + i + " jest " + (i % 2 == 0 ? "parzysta" : "nieparzysta"));
        }
        System.out.println("Pętla do while");
        i = 1;
        do
        {
              System.out.println("Liczba " + i + " jest " + (i % 2 == 0 ? "parzysta" : "nieparzysta"));
        }
        while ((i++)<10);

    }
}
