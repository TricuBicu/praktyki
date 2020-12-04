package Zadanka;

public class Zad3 {
    //Funkcja sumowania liczb
    public static int Sumowanie(int[] tablica) {

        int suma = 0;
        for(int i : tablica) {
            suma = suma + i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] t = {11,22,33,44,55,66,77,88,99,};

        System.out.println(Sumowanie(t));
    }
}

