import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      while (number > 0)
        {
          for (int i = number; i > 0; i--)
          { 
            System.out.print("*");
          }
          System.out.println(" ");
          number--;
        }
  }
}
