package WDomu.Kostki;

import java.security.SecureRandom;

public class Kostka{

    private int k;
    SecureRandom random;

    public Kostka(int k) {
        this.k = k;
        random = new SecureRandom();
    }

    public int rzut() {
        return this.random.nextInt(k) + 1;
    }
}


