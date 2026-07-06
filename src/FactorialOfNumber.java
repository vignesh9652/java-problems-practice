import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:" );
        int number = scanner.nextInt();
         int fact = 1;
         String expression = " ";
        for (int i = number; i >= 1 ; i--) {
            fact = fact * i;
            expression = expression + i;
            if(i != 1){
                expression = expression + "x";
            }
        }
        System.out.println(expression + " = " + fact);
    }
}
