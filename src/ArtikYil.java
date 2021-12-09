import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil ;

        Scanner input = new Scanner(System.in);

        System.out.println("Yılı Giriniz:");
        yil = input.nextInt();

        if (yil % 4 == 0 ) {
            System.out.println(yil + " Yılı Artık Yıldır! ");
        }
        else {
            System.out.println(yil + " Yılı Artık Yıl Değildir.");
        }
    }
}
