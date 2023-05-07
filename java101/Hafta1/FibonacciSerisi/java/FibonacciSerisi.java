package FibonacciSerisi.java;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int elemanSayisi, i = 0, j = 1, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        elemanSayisi = input.nextInt();

        System.out.print(i + " " + j + " ");

        for (int k = 2; k < elemanSayisi; k++) {
            toplam = i + j;
            System.out.print(toplam + " ");
            i = j;
            j = toplam;
        }
    }
}
