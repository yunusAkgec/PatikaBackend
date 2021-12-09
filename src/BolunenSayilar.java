import java.util.Scanner;

public class BolunenSayilar {
    public static void main(String[] args) {
        int k , toplama = 0 , a = 0;
        double ortalama = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz :");
        k = input.nextInt();

        for (int i = 1 ; i <= k ; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplama = toplama + i;
                a++;
            }
        }
        System.out.println("Toplamı :" + toplama);
        ortalama = (toplama / a) ;
        System.out.println("Ortalama : " + ortalama);

    }
}
