package WDomu;

import java.util.Random;

public class Moneta {

    public static void funkcja(){
        // Obiekt generatora
        Random random = new Random();
        //Losowanie liczb 0 albo 1
        int x = random.nextInt(2);
        //Sprawdzenie wartości wylosowanej x = 1 - reszka
        if(x==1){
            //wypisanie reszki
            System.out.println("reszka");
            //Inaczej orzeł
        } else {
            //zwypisanie orła
            System.out.println("orzeł");
        }

    }
    public static void main(String[] args) {
        // Pętla wywołująca funkcje x razy
        for (int x=0; x < 1000; x++) {
            funkcja();
        }
    }
}
