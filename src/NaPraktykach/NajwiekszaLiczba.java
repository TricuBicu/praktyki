package NaPraktykach;

public class NajwiekszaLiczba {
    public static void main(String[] args) {

    int[] tab = {1,732,523,43112,914,3321,12312,3123516,166};

    int n;
    n = tab[0];

    for(int i = 0; i < tab.length; i++){
        if(n < tab[i]){
            n = tab[i];
        }
    }
        System.out.println("Największ libcza to: " +n);
}
}
