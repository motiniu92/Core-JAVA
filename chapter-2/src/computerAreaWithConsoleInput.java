
import java.util.Scanner;

public class computerAreaWithConsoleInput {

    static int num1, num2, result;

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Number for num1: ");
        num1 = SC.nextInt();
        System.out.println("Enter Number for num2: ");
        num2 = SC.nextInt();
        result = num1 + num2;
        System.out.println("Result: " + result);

    }

}
