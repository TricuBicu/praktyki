package NaPraktykach;

public class PierwszaLekcja {
    public static void main(String[] args) {
    //
        //OPERATORY ARYTMETYCZNE
            // https://www.w3schools.com/java/java_operators.asp
        //TYPY ZMIENNYCH https://www.w3schools.com/java/java_variables.asp

            // int/long przechowuują liczby całkowite, bez miejsc po przecinków
        int zmiennai = 10;
        long zmiennal = -20;
            // float przechowuje  liczby zmiennoprzecinkowe z miejscami dziesiętnymi
        float zmiennaf = 1.1f;
            // double przechowuje liczby po przecinku
        double zmiennad = 30.123;
            // booblean przechowuje wartości z dwoma stanami: prawda lub fałsz
        boolean zmiennab = true;
            // char przechowuje pojedyncze znaki, takie jak „a” lub „B”. Wartości znaków są ujęte w pojedyncze cudzysłowy
        char zmiennac = 'K';
            // String przechowuje tekst, na przykład „Hello”. Wartości ciągów są otoczone podwójnymi cudzysłowami
        String zmiennas ="Hello";
        String komunikat = new String("Hello World");

        //TABLICE https://www.w3schools.com/java/java_arrays.asp

            //Tablica char
        char[] tablicachar = new char[5];
        tablicachar[0] = 'H';
        tablicachar[1] = 'e';
        tablicachar[2] = 'l';
        tablicachar[3] = 'l';
        tablicachar[4] = 'o';
            //Tablica int
        int[] tablicaInt = {6, 344, 123, 73, 234, 875};
            //Tablica String
        String[] tablicaString = {"S1","S2","S3","S4"};

        //PĘTLE

            //Pętla for jest typową pętlą iteracyjną - łatwo sterowalną, bo macie zmienną iterującą, warunek i ciało po obiegu w tym samym miejscy
        for(int i = 0; i < 30; i++);
        {
                //Instrukcja warunkowa https://www.w3schools.com/java/java_operators.asp
            if (0 < zmiennai)
            {
                zmiennai = -1;
            }
            else
            {
                zmiennai = 30;
            }
            //wyświetlenie zmiennai co linijke
         System.out.println(zmiennai);
        }

            //Tu jest możliwość wykorzystania pętli foreach (nie omówiliśmy jej jeszcze)
        for (int i = 0; i < tablicachar.length; i++)
        {
            //wyświetlenie tablicychar w jednej linijce
            System.out.print(tablicachar[i]);
        }

        //Pętla while jest pętla z argumentem - łatwo się tego używa, ale ciężej taką petlą sterować (iterator musicie obmyśleć sami, a zmiane warunku iteracji trzeba zawzreć w ciele pętli)
        int iteration = 0;
        while(iteration < 15)
        {
            System.out.println(komunikat);
            iteration += 1;
        }

        //Przykład pętli do-while
        //Do-while zawsze wykonuje pierwszy obieg pętli
        boolean stopLoop = true;
        do
        {
            stopLoop = false;
            System.out.println("Wykonanie pętli");
        }
        while(stopLoop);


        //Tu wypisuje jaki jest znak ASCII dla litery f
        //Gdy piszemy (typ zmiennej)zmienna to wymuszamy konwersję z jednego typu na inny
        System.out.println((int)'f');

    }
}
