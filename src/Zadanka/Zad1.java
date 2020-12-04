package Zadanka;

public class Zad1 {

    public static void main(String[] args) {
        //Wypisz liczby parzyste w przedziale od 1 do 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}