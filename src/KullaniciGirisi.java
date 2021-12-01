import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName , password , newPassword ;
        int sifirlama;
        String reelUserName = "patika" ;
        String reelPassword = "Java123" ;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = input.nextLine() ;

        if (userName.equals(reelUserName) && password.equals(reelPassword)) {
            System.out.println("Giriş Yaptınız!!");

        }
        else {
            System.out.println("Bilgileriniz Yanlış \n Şifrenizi Sıfırlamak İsterseniz 1 'e Basın.");
            sifirlama = input.nextInt();

            if (sifirlama == 1) {
                System.out.print("Yeni Şifrenizi Giriniz :");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals(reelPassword)){
                    System.out.println("Şifre Oluşturulamadı. Lütfen Tekrar Deneyiniz.");
                }
                else {
                    System.out.println("Şifreniz Başarıyla Değiştirilmiştir.");
                }


            }
        }
    }
}
