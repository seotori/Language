package 단계_1;
import java.util.Scanner;
public class 문제1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A= scanner.nextInt(),B= scanner.nextInt(),C = scanner.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
