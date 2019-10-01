import java.util.Scanner;

public class Avg{
  public static void main (String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    System.out.println(" " + (num1+num2+num3)/3);

  }
}
