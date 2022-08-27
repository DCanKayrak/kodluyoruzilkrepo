import java.time.Year;
import java.util.Scanner;
public class ArtikYilHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int year;
        boolean artikYilMi = false;

        System.out.println("Yıl değerini giriniz : ");
        year = gir.nextInt();

        if(year%100==0){
            if(year%400==0){
                artikYilMi = true;
            }
        }else{
            if(year%4==0){
                artikYilMi = true;
            }
        }
        System.out.println(year+" değerinin artık yıl olma durumu : "+artikYilMi);
    }
}
