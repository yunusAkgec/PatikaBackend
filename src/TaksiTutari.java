import java.util.Scanner;

public class TaksiTutari {
    public static void main(String[] args) {
        double km , tutar , odenecekTutar , kmUcreti = 2.20 ;
        int acilis = 10 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Kilometre Yol Gittiniz? :");
        km = input.nextDouble();
        tutar = acilis + (km * kmUcreti) ;
        if (tutar<20) {
            odenecekTutar = 20 ;
            System.out.println("Ödenecek Tutar :"+odenecekTutar + " TL");
        }
        else {
            odenecekTutar = tutar ;
            System.out.println("Ödenecek Tutar : " + odenecekTutar + " TL");
        }


    }
}
