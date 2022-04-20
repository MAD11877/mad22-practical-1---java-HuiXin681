import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Height: ");
    double height = in.nextDouble();
    System.out.print("Enter Weight: ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    System.out.print(bmi);
  }
}
