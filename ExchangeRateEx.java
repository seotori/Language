package kim_basic.cond;

public class ExchangeRateEx {
	public static void main(String[] args) {
		int dollor = 10;
		
		if (dollor < 0) {
			System.out.println("잘못된 금액입니다.");
		} else if (dollor == 0) {
			System.out.println("환전할 금액이 없습니다.");
		} else {
			double won = dollor * 1352.54;
			System.out.println("환전할 금액은 " + won + "원입니다.");
		}
	}
}
