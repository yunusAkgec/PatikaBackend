import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        double sicaklik;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        sicaklik = scan.nextDouble();

        if (sicaklik < 5){
            System.out.println("Kayağa gidebilirsiniz. ");
        }
        else if ((sicaklik >= 5) && (sicaklik < 15) ){
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else if ((sicaklik >= 15) && (sicaklik < 25)){
            System.out.println("Pikniğe gidebilirsiniz. ");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }
    }
}
