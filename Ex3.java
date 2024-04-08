package kim_start.loop;

public class Ex3 {
	public static void main(String[] args) {
		
		//while
		int max = 100;
		
		int sum = 0;
		int i = 1;
		
		while (i <= max) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		//for
		int maxF = 100;
		int sumF = 0;
		for(int iF = 1; iF <= maxF; iF++) {
			sumF += iF;
		}
		System.out.println(sumF);
	}
}
