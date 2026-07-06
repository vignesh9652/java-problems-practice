import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:" );
        int num = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " "+ secondNumber + " ");
        for (int i = 2; i < num; i++) {
            int next = firstNumber + secondNumber;
            System.out.print(next + " ");
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
