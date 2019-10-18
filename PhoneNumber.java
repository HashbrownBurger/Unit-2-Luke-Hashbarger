import java.util.Random;
public class PHONENUMBER {
  public static void main(String[] arg){
    Random rand = new Random();
    int d1 = (rand.nextInt(7) +2);
    int d2 = rand.nextInt(9);
    int d3 = rand.nextInt(10);
    int d4 = (rand.nextInt(7)+2);
    int d5 = rand.nextInt(10);
    int d6 = rand.nextInt(10);
    int d7 = rand.nextInt(10);
    int d8 = rand.nextInt(10);
    int d9 = rand.nextInt(10);
    int d10 = rand.nextInt(10);

    System.out.print("(" + d1);
    System.out.print(d2);
    System.out.print(d3 + ")");
    System.out.print(d4);
    System.out.print(d5);
    System.out.print(d6 + "-");
    System.out.print(d7);
    System.out.print(d8);
    System.out.print(d9);
    System.out.print(d10);
  }
}
