import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     double a=scan.nextDouble();
     double b=scan.nextDouble();
     String type=scan.next();
      if(type.equals("Addition"))
      {
          System.out.print(a+b);
      }
      
     else if(type.equals("Subtraction"))
     {
         System.out.print(a-b);
     }
     else if(type.equals("Multiplication"))
     {
         System.out.print(a*b);
     }
     else if(type.equals("Division"))
     {
      if( b!=0)
      {
      System.out.println(a/b);
      }
      else
      {
          System.out.println("number can not divided by zero");
      }
     }
     else
     {
         System.out.println("enter valid type of operation");
     }
     
     
    }
}
