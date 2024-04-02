package kim_basic.cond;

public class DistanceEx {
	public static void main(String[] args) {
		int distance = 101;
		
		if (distance <= 1) {
			System.out.println("거리: " + distance + "km, " + "도보");
		} else if (distance <= 10) {
			System.out.println("거리: " + distance + "km, " + "자전거");
		} else if (distance <= 100) {
			System.out.println("거리: " + distance + "km, " + "자동차");
		} else 
			System.out.println("거리: " + distance + "km, " + "비행기");
	}
}
