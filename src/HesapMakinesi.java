import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double sayi1 , sayi2 , sonuc ;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz : ");
        sayi1 = input.nextDouble();
        System.out.println("2. Sayıyı Giriniz");
        sayi2 = input.nextDouble();
        System.out.println("1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        secim = input.nextInt();

        switch (secim) {
            case 1 :
                sonuc = sayi1 + sayi2 ;
                System.out.println(sonuc);
                break;
            case 2 :
                sonuc = sayi1 - sayi2 ;
                System.out.println(sonuc);
                break;
            case 3 :
                sonuc = sayi1 * sayi2 ;
                System.out.println(sonuc);
                break;
            case 4 :
                sonuc = sayi1 / sayi2 ;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız.");
        }

    }
}
