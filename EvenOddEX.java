package kim_start.cond;

public class EvenOddEX {
	public static void main(String[] args) {
		int x = 97;
		String result = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x = " + x + ", " +result);
	}
}
