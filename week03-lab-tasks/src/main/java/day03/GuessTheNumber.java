package day03;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Finder finder = new Finder();
        System.out.println("Gondoltam egy egész számot 1 és 100 között. Találd ki mi az! Kárem a tippeket, 6-ot tippelhetsz.");
        for (int i = 1; i <= 6; i++) {
            if (!finder.findOk) {
                    System.out.println(i +". tipp");
                    int num = sc.nextInt();
                    sc.nextLine();
                    finder.examNumber(num);
                }
            }
    }
}
