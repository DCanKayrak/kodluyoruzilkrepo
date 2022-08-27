import java.util.Scanner;

public class BasamaklariTopla {


    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.println("Sayı Giriniz.");
        int sayi = gir.nextInt();

        int basamak = 0;
        int toplam = 0;
        while (sayi > 0) {
            basamak++;
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Toplam = " + toplam);
        System.out.println("Basamak sayısı : " + basamak);
    }
}
