import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double acilisMiktari,artisOrani,tutar,km;

        acilisMiktari = 10;
        artisOrani = 2.20;

        System.out.println("Gidilen km : ");
        km = gir.nextDouble();

        tutar = acilisMiktari + (artisOrani*km);

        if(tutar<20){
            tutar = 20;
        }

        System.out.println("Tutar : "+ tutar);
    }
}
