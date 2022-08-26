import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 , n2 , islem;

        System.out.println("1.Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("Yapmak istenilen işlem nedir ? \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
        }
    }
}
