import java.util.Scanner;
public class GirilenSayiyaKadarCift {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        int sayi = gir.nextInt();
        int ortalama = 0;
        int counter = 0;
        for(int i=1;i<sayi;i++){
            if(i%3 == 0 && i%4 == 0){
                counter++;
                ortalama += i;
            }
        }
        System.out.println(ortalama/counter);
    }
}
