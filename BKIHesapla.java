import java.util.Scanner;
public class BKIHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double kilo,boy;

        System.out.println("Kilonuzu Giriniz : ");
        kilo = gir.nextDouble();
        System.out.println("Boyunuzu Giriniz : ");
        boy = gir.nextDouble();

        double bki = kilo / boy * boy;
        System.out.println("BKİ : "+bki);
    }
}
