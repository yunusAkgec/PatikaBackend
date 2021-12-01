import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy , kilo , kitleIndeksi ;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz : ");
        boy = input.nextDouble() ;

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble() ;

        kitleIndeksi= kilo/Math.pow(boy , 2) ;
        System.out.println("Vücut Kitle İndeksiniz :" + kitleIndeksi);
    }
}
