package kim_start.training;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단의 단 수를 입력해주세요: ");
		int n = scanner.nextInt();
		
		System.out.println(n + "단의 구구단:");
		
		int i;
		int sum = 0;
		for (i = 1; i <= 9; i++) {
			sum = n * i;
			System.out.println(n + " x " + i + " = " + sum);
		} 
	}
}
