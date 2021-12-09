import java.util.Scanner;

public class CinZodyagi {
        public static void main(String[] args) {
            double dogumYili ;
            String zodyak ;

            Scanner input = new Scanner(System.in);
            System.out.println("Doğum Yılınızı giriniz:");
            dogumYili = input.nextDouble();

            if (dogumYili % 12 == 0){
                zodyak = "Maymun " ;
            }
            else if (dogumYili % 12 == 1){
                zodyak = "Horoz" ;
            }
            else if (dogumYili % 12 == 2){
                zodyak = "Köpek " ;
            }
            else if (dogumYili % 12 == 3){
                zodyak = "Domuz " ;
            }
            else if (dogumYili % 12 == 4){
                zodyak = "Fare " ;
            }
            else if (dogumYili % 12 == 5){
                 zodyak = "Öküz " ;
            }
            else if (dogumYili % 12 == 6){
                 zodyak = "Kaplan " ;
            }
            else if (dogumYili % 12 == 7){
                 zodyak = "Tavşan " ;
            }
            else if (dogumYili % 12 == 8){
                 zodyak = "Ejderha " ;
            }
            else if (dogumYili % 12 == 9){
                 zodyak = "Yılan " ;
            }
            else if (dogumYili % 12 == 10){
                 zodyak = "At " ;
            }
            else {
                 zodyak = "Koyun " ;
            }
            System.out.println("Çin Zodyağınız : " + zodyak);
        }
}
