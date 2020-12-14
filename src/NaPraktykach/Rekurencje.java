package NaPraktykach;

public class Rekurencje {

    public static int rekur(int x){
        if (x > 0){
            return rekur(x-1);
        }
        return x;
    }

    public static int fibb(int x){

        if (x == 0) return 0;
        if (x == 1) return 1;
        if (x > 1)  return fibb(x-1) + fibb(x-2);

        else {
            return 0;
        }

    }


    public static float funkcja_kwadratowa(float x){
        return 2*x*x - 3*x +4;
    }


    public static void print_table(int[]arr){
        for(int i=0; i< arr.length; i++){
            System.out.println((arr[i] +","));
        }
    }


    public static void main(String[] args) {

//        System.out.println(funkcja_kwadratowa(5));
//    int[] tab = {1, 2, 3, 56, 72, 41, 4 , 6, 7, 2, 7, 8, 12};
//        print_table(tab);
            System.out.println(fibb(2));
   }
}
