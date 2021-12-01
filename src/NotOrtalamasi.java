import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz");
        float mat = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        float fizik = inp.nextFloat();
        System.out.println("Kimya Notunuzu Giriniz");
        float kimya = inp.nextFloat();
        System.out.println("Türkçe Notunuzu Giriniz");
        float turkce = inp.nextFloat();
        System.out.println("Tarih Notunuzu Giriniz");
        float tarih = inp.nextFloat();
        System.out.println("Müzik Notunuzu Giriniz");
        float muzik = inp.nextFloat();

        float notOrtalamasi = ((mat + fizik + kimya + turkce + tarih + muzik)/7) ;
        System.out.printf("%s = %.2f\n " , "Not Ortalamanız : " , notOrtalamasi);

        String b = (notOrtalamasi >= 60) ? "Tebrikler! Sınıfı Geçtiniz." : " Sınıfta Kaldınız.";
        System.out.println(b);
    }

}


