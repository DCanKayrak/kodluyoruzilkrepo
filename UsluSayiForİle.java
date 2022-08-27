import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        int sonuc = 1;

        System.out.println("Alt : ");
        int alt = gir.nextInt();
        System.out.println("Üs : ");
        int üs = gir.nextInt();

        // 2 üssü 3 = 2 * 2 * 2

        for (int i = 0; i < üs; i++) {
            sonuc *= alt;
        }
        System.out.println("Sonuç : " + sonuc);
    }
}
