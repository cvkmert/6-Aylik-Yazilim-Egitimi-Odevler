package CinZodyagi.java;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        int birthYear = input.nextInt();
        String[] zodiac = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int index = birthYear % 12;
        System.out.println("Çin Zodyağı Burcunuz : " + zodiac[index]);
    }
}
