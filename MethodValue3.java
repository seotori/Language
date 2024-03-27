package start.method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, number: " + num); //5
        num = changeNumber(num);
        System.out.println("2. changeNumber 호출 후, number: " + num); //5
    }

    public static int changeNumber(int num) {
        num = num * 2;
        return num;
    }
}
