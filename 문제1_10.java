package 단계_1;
import java.util.Scanner;
public class 문제1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * (num2 % 100 - num2 % 10) / 10);
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);

    }
}
