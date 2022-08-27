import java.util.Scanner;
public class BurcNe {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int gun,ay;
        boolean loop = true;
        // Seri olarak bulabilmek için loop'a aldım.İstersem sonlandırabilirim.Fakat böyle hoşuma gitti :)
        while(loop){

            System.out.println("Doğum Tarihinizin Gün Bilgisini Giriniz.");
            gun = gir.nextInt();

            if (gun > 0 && gun < 30) {
                System.out.println("Doğum Tarihinizin Ay Bilgisini Giriniz.");
                ay = gir.nextInt();
                if(ay<=12 && ay>0){
                    // girdilere göre burçlar.
                    if(gun>=21 && ay == 3 || gun<=20 && ay == 4){
                        System.out.println("Burcunuz : Koç");
                    }
                    else if(gun>=21 && ay == 4 || gun<=21 && ay == 5){
                        System.out.println("Burcunuz : Boğa");
                    }
                    else if(gun>=22 && ay == 5 || gun<=22 && ay == 6){
                        System.out.println("Burcunuz : İkizler");
                    }
                    else if(gun>=23 && ay == 6 || gun<=22 && ay == 7){
                        System.out.println("Burcunuz : Yengeç");
                    }
                    else if(gun>=23 && ay == 7 || gun<=22 && ay == 8){
                        System.out.println("Burcunuz : Aslan");
                    }
                    else if(gun>=23 && ay == 8 || gun<=22 && ay == 9){
                        System.out.println("Burcunuz : Başak");
                    }
                    else if(gun>=23 && ay == 9 || gun<=22 && ay == 10){
                        System.out.println("Burcunuz : Terazi");
                    }
                    else if(gun>=23 && ay == 10 || gun<=21 && ay == 11){
                        System.out.println("Burcunuz : Akrep");
                    }
                    else if(gun>=22 && ay == 11 || gun<=21 && ay == 12){
                        System.out.println("Burcunuz : Yay");
                    }
                    else if(gun>=22 && ay == 12 || gun<=21 && ay == 1){
                        System.out.println("Burcunuz : Oğlak ");
                    }
                    else if(gun>=22 && ay == 1 || gun<=19 && ay == 2){
                        System.out.println("Burcunuz : Kova");
                    }else{
                        System.out.println("Burcunuz : Balık");
                    }

                }
                else{
                    System.out.println("Geçersiz Ay");
                }
            } else {
                System.out.println("Geçersiz Gün.");
            }
        }
    }
}
