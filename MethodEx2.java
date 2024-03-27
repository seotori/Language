package start.method;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("*",1);
        printMessage("*",2);
        printMessage("*",3);
        printMessage("*",4);
        printMessage("*",5);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(message);
        }
        System.out.println();
    }
}
