package NaPraktykach;

public class SredniaArytmetyczna {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 2, 2,};
        double suma = 0;

        for (int i = 0; i < tab.length; i++) {
            suma=suma + tab[i];
        }

        suma = suma / tab.length;
        System.out.println("Srednia arytmetyczna wynosi: " + suma);
    }
}

