import java.util.Scanner;
public class DaireHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double r, alpha;
        final double PI = 3.14f;

        System.out.println("R : ?");
        r = gir.nextDouble();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        System.out.println("Alan : "+alan+"\nCevre : "+cevre);




    }
}
