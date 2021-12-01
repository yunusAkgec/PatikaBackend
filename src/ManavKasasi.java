import java.util.Scanner;

public class ManavKasasi {
    public static void main(String[] args) {
        double tutar ,armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5  ;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo Aldınız?");
        double a = input.nextDouble();
        double armutTutar = a * armut ;

        System.out.println("Elma Kaç Kilo Aldınız?");
        double b = input.nextDouble();
        double elmaTutar = b * elma ;

        System.out.println("Domates Kaç Kilo Aldınız?");
        double c = input.nextDouble();
        double domatesTutar = c * domates ;

        System.out.println("Muz Kaç Kilo Aldınız?");
        double d= input.nextDouble();
        double muzTutar = d * muz ;

        System.out.println("Patlican Kaç Kilo Aldınız?");
        double e = input.nextDouble();
        double patlicanTutar = e * patlican;

        tutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar ;
        System.out.println("Toplam Tutar : " + tutar + " TL");
    }
}
