import java.util.Scanner;

public class RecursivePattern {
    static int addition(int number) {
        System.out.print(number + " ");
        if (number <= 0)
            return number;
        int nextNumber = addition(number - 5) + 5;
        System.out.print(nextNumber + " ");
        return nextNumber;
    }

    static int minus(int number) {
        System.out.print(number + " ");
        if (number > 0)
            return number;
        int nextNumber = minus(number + 5) - 5;
        System.out.print(nextNumber + " ");
        return nextNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number: ");
        int num = sc.nextInt();
        System.out.print("The pattern: ");
        if (num > 0)
            addition(num);
        else
            minus(num);
    }
}