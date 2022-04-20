import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt(),c;
    int [] a= new int[number];
    int [] b= new int[number];
    for  (int i=0; i<number;i++){
      a[i] = in.nextInt();
    }
    for (int i=0; i<number;i++)
      {
        c=1;
        for(int j=i+1;j<number;j++){
          if(a[i]==a[j])
          {
            c++;
            a[j]=-1;
          }
          b[i]=c;
        }
      }
    int m = b[0];
    for(int i=0; i<number;i++){
      if(b[i] >= m){
        m = b[i];
      }
    }
    for(int i=0; i<number;i++){
      if(b[i] == m){
        System.out.print(a[i]);
      }
    }
  }
}
