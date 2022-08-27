import java.util.*;
public class UcusFiyatHesapla {
    public static void main(String[] args) {
        float mesafeBasinaUcret = 0.10f;
        int gidilenKm,yas,gidisDonusMu;
        double fiyat;


        Scanner gir = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        gidilenKm = gir.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas = gir.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        gidisDonusMu = gir.nextInt();

        if((gidisDonusMu == 1 || gidisDonusMu == 2) && gidilenKm>0 && yas>0){
            fiyat = gidilenKm*mesafeBasinaUcret*gidisDonusMu;
            if(yas<12){
                fiyat /= 2;
            }else if(yas<24){
                fiyat *= 0.9;
            }else if(yas>65){
                fiyat *= 0.7;
            }

            if(gidisDonusMu == 2){
                fiyat *= 0.8;
            }

            System.out.println("Fiyatınız : "+fiyat);

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}
