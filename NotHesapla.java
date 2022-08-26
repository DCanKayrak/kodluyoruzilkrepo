import java.util.Scanner;
public class NotHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        float Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;

        System.out.println("Matematik Notunuz?");
        Matematik = gir.nextFloat();
        System.out.println("Fizik Notunuz?");
        Fizik = gir.nextFloat();
        System.out.println("Kimya Notunuz?");
        Kimya = gir.nextFloat();
        System.out.println("Türkçe Notunuz?");
        Türkçe = gir.nextFloat();
        System.out.println("Müzik Notunuz?");
        Müzik = gir.nextFloat();
        System.out.println("Tarih Notunuz?");
        Tarih = gir.nextFloat();

        float ort = (Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik)/6;
        System.out.println("Ortalamanız : "+ort);

    }
}
