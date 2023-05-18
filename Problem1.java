import java.util.Scanner;

public class Problem1 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three Floating-point value seperated by spaces: ");
        double firstNumber = in.nextDouble();
        double secondNumber = in.nextDouble();
        double thirdNumber = in.nextDouble();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Maximum is: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Maximum is: " + secondNumber);
        } else {
            System.out.println("Maximum is: " + thirdNumber);
        }
    }
}