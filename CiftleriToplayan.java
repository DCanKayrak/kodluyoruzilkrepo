import java.util.Scanner;

public class CiftleriToplayan {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.println("Sayi Giriniz.");
            int sayi = gir.nextInt();
            if (sayi % 2 == 1) {
                break;
            } else if (sayi % 4 == 0) {
                toplam += sayi;

            }

        }
        System.out.println(toplam);

    }
}
