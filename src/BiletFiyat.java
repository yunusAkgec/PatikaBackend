import java.util.Scanner;
import java.lang.reflect.Field;
import java.lang.StringBuilder;

public class BiletFiyat {
    public static void main(String[] args) {

        try {
            double age, range, travelType, ticketCost;

            Scanner scan = new Scanner(System.in);

            System.out.println("Mesafeyi Giriniz (KM) : ");
            range = scan.nextDouble();
            System.out.println("Yaşınızı Giriniz : ");
            age = scan.nextDouble();
            System.out.println("Yolculuk Türünüzü Giriniz (1 yada 2) : ");
            travelType = scan.nextDouble();
            while (!(range >= 0)) {
                System.out.println("Yanlış Karakter Girişi Yaptınız. Lütfen Tekrar Deneyiniz.");
                range = scan.nextDouble();

            }
            while (!(age >= 1)) {
                System.out.println("Yanlış Karakter Girişi Yaptınız. Lütfen Tekrar Deneyiniz. ");
                age = scan.nextDouble();
            }
            while (!((travelType == 1) || (travelType == 2))) {
                System.out.println("Yanlış Karakter Girişi Yaptınız. Lütfen Tekrar Deneyiniz. ");
                travelType = scan.nextDouble();
            }

            ticketCost = range / 10;
            if (travelType == 2) {
                ticketCost = ticketCost - (ticketCost / 5);
            }

            if ((age < 12)) {
                ticketCost = ticketCost - (ticketCost / 2);
            }
            if ((age > 12) && (age < 24)) {
                ticketCost = ticketCost - (ticketCost / 10);
            }
            if ((age >= 65)) {
                ticketCost = ticketCost - (ticketCost / 3);
            }

            System.out.println("Bilet Fiyatınız: " + ticketCost * travelType);
        } catch (Exception InputMismatchException) {
            System.out.println("Yanlış Karakter Girişi Yaptınız. Lütfen Programı Tekrar Çalıştırınız.");
        }



    }
}