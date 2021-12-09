import java.util.Scanner;

public class RecursivePower{

    public static void main(String[] args) {
        int base , power ;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz :");
        base = input.nextInt();
        System.out.println("2. Sayıyı giriniz : ");
        power = input.nextInt();
        int result = power(base, power);

        System.out.println(base + "^" + power + "=" + result);
    }

    public static int power(int base, int power) {
        if (power != 0) {
            return (base * power(base, power - 1));
        }
        else {
            return 1;
        }
    }


}
