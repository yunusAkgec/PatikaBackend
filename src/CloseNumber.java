import java.util.Arrays;
import java.util.Scanner;

public class CloseNumber {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        int n = arr.length;
        int index = 0;
        int[] newArr = new int[n+1];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak İstediğiniz Değeri Giriniz:");
        int number = input.nextInt();

        for(int i = 0; i<newArr.length; i++) {
            if(i==index) {
                newArr[i] = number;
            }else {
                newArr[i] = arr[j];
                j++;
            }
        }
        Arrays.sort(newArr);
        System.out.println("Değerinizin listeye eklenmiş ve sıralanmış hali : "+Arrays.toString(newArr));

        for (int a = 0 ; a < newArr.length ; a++){
            if (newArr[a] == number) {
                System.out.println("Sayınızdan küçük en büçük değer :" + newArr[a-1]);
                System.out.println("Sayınızdan büyük en küçük değer : " + newArr[a+1]);
            }

        }

    }

}
