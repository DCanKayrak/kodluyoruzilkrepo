import java.util.Scanner;
public class LogInService {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        String username,password,newPassword;

        System.out.println("Kullanıcı Adınızı Giriniz.");
        username = gir.next();

        System.out.println("Şifrenizi Giriniz.");
        password = gir.next();

        if(username.equals("Atom") && password.equals("1938")){
            System.out.println("Giriş Yaptınız.");
        }else{
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz ?\nEvet İçin 1\nHayır İçin 2'ye basınız.");
            int sifreSifirlansinMi = 0;
            sifreSifirlansinMi = gir.nextInt();
            if(sifreSifirlansinMi==1){
                System.out.println("Yeni Şifre Griiniz");
                newPassword = gir.next();
                password = newPassword;
            }else{
                System.out.println("Giriş Yapılamadı.");
            }
        }
    }
}
