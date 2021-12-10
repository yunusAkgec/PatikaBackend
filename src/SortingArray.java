import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        int n ;
        int num ;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu : ");
        n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin Elemanlarını Giriniz:");
        for ( int i = 0 ; i < n ; i++){
            System.out.print( (i+1) + ". Elemanı : ");
            num = input.nextInt();
            arr[i] = num;
        }

        System.out.print("Sıralama : ");
        Arrays.sort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
