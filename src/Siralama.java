import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int i;
        int dizi[] = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("3 adet sayı giriniz.");

        for (i=0;i < dizi.length ; i++ ){
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
}
