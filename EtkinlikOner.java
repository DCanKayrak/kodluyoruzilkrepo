import java.util.Scanner;

/**
 * @author Danyal Can Kayrak, 27/08/2022 02:28 AM
 */


public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz.");
        int sicaklik = gir.nextInt();

        if(sicaklik<-20 && sicaklik > 50){
            System.out.println("Sicaklik Geçersiz.");
        }else{
            if(sicaklik<5){
                System.out.println("Kayak");
            }
            if(sicaklik>5 && sicaklik<15){
                System.out.println("Sinema");
            }
            if(sicaklik>15 && sicaklik<25){
                System.out.println("Piknik");
            }
            if(sicaklik>25){
                System.out.println("Yüzme");
            }
        }
    }
}
