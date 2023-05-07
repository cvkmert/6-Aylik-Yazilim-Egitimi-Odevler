package AsalSayilar.java;

public class AsalSayilar {
    public static void main(String[] args) {
        int sayi = 0;
        boolean asal = true;

        for (int i = 2; i <= 100; i++) {
            asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
