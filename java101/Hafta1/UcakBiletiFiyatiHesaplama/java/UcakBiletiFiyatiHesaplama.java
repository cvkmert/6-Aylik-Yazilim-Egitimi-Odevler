package UcakBiletiFiyatiHesaplama.java;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int yolculukTipi = input.nextInt();

        double normalTutar = mesafe * 0.10;
        double indirimliTutar = 0;
        double yasIndirimi = 0;
        double yolculukIndirimi = 0;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {

            if (yas < 12) {
                yasIndirimi = normalTutar * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.1;
            } else if (yas >= 65) {
                yasIndirimi = normalTutar * 0.3;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                yolculukIndirimi = indirimliTutar * 0.2;
                indirimliTutar -= yolculukIndirimi;
            }

            System.out.println("Toplam Tutar = " + (yolculukTipi == 2 ? indirimliTutar * 2 : indirimliTutar) + " TL");

        }

        input.close();

    }

}
