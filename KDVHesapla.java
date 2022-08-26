import java.util.Scanner;
public class KDVHesapla {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        float kdvsizFiyat,kdvliFiyat,kdvOrani;

        System.out.println("KDVsiz fiyatı giriniz : ");
        kdvsizFiyat = gir.nextFloat();

        if(kdvsizFiyat>0 && kdvsizFiyat<1000){
            kdvOrani = 0.18f;
        }else{
            kdvOrani = 0.08f;
        }

        kdvliFiyat = kdvsizFiyat + (kdvsizFiyat*kdvOrani);
        System.out.println(kdvliFiyat);

    }
}
