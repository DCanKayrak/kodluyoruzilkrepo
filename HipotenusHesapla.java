import java.util.Scanner;
public class HipotenusHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double a,b,c;

        System.out.println("a : ");
        a = gir.nextDouble();
        System.out.println("b : ");
        b = gir.nextDouble();

        c = Math.pow(a,2)+Math.pow(b,2);
        System.out.println(c);

    }
}
