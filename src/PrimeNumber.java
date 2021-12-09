import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the number? : ");
        int n = scan.nextInt();

        if (primeNumber(n, 2))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    static boolean primeNumber(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return primeNumber(n, i + 1);
    }


}