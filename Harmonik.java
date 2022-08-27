import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.println("Sayınızı giriniz.");
        int sayi = gir.nextInt();
        double result = 0;

        for(int i=1;i<=sayi;i++) {
            result += 1.0/i;

        }
        System.out.println(result);
    }
}
