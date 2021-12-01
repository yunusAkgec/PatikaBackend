import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double tutar , kucukKdvOran = 0.18 , buyukKdvOran = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar= input.nextDouble();
        if ((tutar > 0) && (tutar <= 1000)){
                double kdvTutar = tutar * kucukKdvOran;
                double kdvliTutar = tutar + kdvTutar ;
                System.out.println("KDV'siz Tutar: " + tutar);
                System.out.println("KDV Oranı : " + kucukKdvOran);
                System.out.println("KDV Tutarı : " +kdvTutar);
                System.out.println("KDV'li Tutar : " + kdvliTutar);
        }
        if ( tutar > 1000) {
            double kdvTutar = tutar * buyukKdvOran ;
            double kdvliTutar = tutar + kdvTutar ;
            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı : " + buyukKdvOran);
            System.out.println("KDV Tutarı : " +kdvTutar);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }
    }
}
