import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a Name : ");
        String name = scanner.nextLine();
        reverseOfString(name);
    }
    public static void reverseOfString(String name){
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
             reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse Of A Element :" +reverse);
    }
}
