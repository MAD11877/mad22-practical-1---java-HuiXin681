import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    system.out.println("Enter Height- ");
    double height = in.nextDouble();
    system.out.println("Enter Weight- ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    system.out.println(bmi);
  }
}
