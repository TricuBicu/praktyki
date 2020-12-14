package NaPraktykach;

import java.util.ArrayList;
import java.util.Scanner;

public class ŚrArtZWpisywaniem {
    public static void main(String[] args) {

        ArrayList<Integer> tab;
        tab = new ArrayList<Integer>();

        Scanner liczby = new Scanner(System.in);

        for(int x=0; x<5; x++){
            int a = liczby.nextInt();
            tab.add(a);
        }

        double suma = 0;

        for (int i = 0; i < tab.size(); i++) {
            suma=suma + tab.get(i);
        }

        suma = suma / tab.size();
        System.out.println("Srednia arytmetyczna wynosi: " + suma);
    }
}

