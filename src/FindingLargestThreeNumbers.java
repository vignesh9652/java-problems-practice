public class FindingLargestThreeNumbers {
  public static void main(String[] args) {
      int a = 90;
      int b = 100;
      int c = 110;
      if (a >= b && a >= c){
          System.out.println(a + " is largest");
      } else if (b >= a && b >= c) {
          System.out.println(b + " is largest");
      }
      else System.out.println(c + " is largest");
  }
}
