package WDomu;

public class Sumowanie {
    //Sumowanie liczb
    public static void main(String[] args) {
    System.out.println("Sumowanie Liczb");
    int liczby[] = {5, 23, 54, 25, 12, 64, 75, 3, 54, 10};
        int suma = 0;
    for(int i = 0; i < liczby.length; i++) {
        suma += liczby[i];

    }
    System.out.println("Suma tych liczb wynosi:" +suma);
    }
}

