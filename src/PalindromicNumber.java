import java.util.Scanner;

public class PalindromicNumber {
    static boolean isPalindrome(int number){
        int number2 = number ,reverseNumber = 0, lastNumber;
        while (number2 != 0){
            lastNumber = number2 % 10 ;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            number2 = number2 /10 ;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("What is number? :");
        a = input.nextInt();

        System.out.println(isPalindrome(a));
    }
}
