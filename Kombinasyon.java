import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.println("C(n,r) programına hoşgeldiniz.");

        System.out.println("n sayısını giriniz");
        int n = gir.nextInt();

        System.out.println("r sayısını giriniz");
        int r = gir.nextInt();

        System.out.println(Factorial(n)/(Factorial(r)*Factorial(n-r)));
    }
    public static int Factorial(int sayi){
        int fac = 1;
        for(int i = sayi;i>0;i--){
            fac *= i;
        }
        return fac;
    }
}
