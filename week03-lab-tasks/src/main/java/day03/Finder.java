package day03;

import java.util.Random;

public class Finder {
    boolean findOk = false;

    Random rnd = new Random();
    int num = rnd.nextInt(100) + 1;

    public void examNumber(int findNumber) {
        if (findNumber < num) {
            System.out.println("A számod kisebb mint a keresett szám");
            //System.out.println(num); //tesztelés miatt kiíratom a gondolt számot
        } else if (findNumber > num) {
            System.out.println("A számod nagyobb mint a keresett szám");
        } else {
             System.out.println("Kitaláltad ezt a számot gondoltam");
             findOk = true;
        }
    }
}
