import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int x=scan.nextInt();
     x = x%2==0 ? x-1:x;
     int n=0;
     int count =0;
     while(count<x-1)
     {
        if(n%2!=0)
        {
          System.out.print(n+",");
          count++;
        }
        n++;
     }
     System.out.print(n+1);
    
  }
}
