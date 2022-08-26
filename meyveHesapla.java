import java.util.Scanner;
public class MeyveHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double Armut,Elma,Domates,Muz,Patlıcan;

        System.out.println("Armut Kaç Kg : ");
        Armut = gir.nextDouble();
        System.out.println("Elma Kaç Kg : ");
        Elma = gir.nextDouble();
        System.out.println("Domates Kaç Kg : ");
        Domates = gir.nextDouble();
        System.out.println("Muz Kaç Kg : ");
        Muz = gir.nextDouble();
        System.out.println("Patlıcan Kaç Kg : ");
        Patlıcan = gir.nextDouble();


        Armut *= 2.14;
        Elma *= 3.67;
        Domates *= 1.11;
        Muz*=0.95;
        Patlıcan *= 5.00;

        System.out.println("Armut : "+Armut+"\nElma : "+Elma+"\nDomates : "+"\nMuz : "+Muz+"\nPatlıcan : "+Patlıcan);
    }
}
