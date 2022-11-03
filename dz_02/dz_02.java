package dz_02;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class dz_02 {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        Character[] charList = {
            new charWarior(), new charRanger()
        };

        for (int i = 0; i < 5; i++) {
            int c0 = Math.abs(rnd.nextInt(2));
            int c1 = c0>0?c0-1:c0+1;
            System.out.println(String.format("Round %s", i));
            charList[c0].getHP();
            charList[c1].getHP();
            charList[c0].Attack(charList[c1]);
            charList[c0].getHP();
            charList[c1].getHP();
        }




    }
}

