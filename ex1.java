import java.util.*;
import java.io.*;
import java.lang.*;
public class ex1
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;  
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
  // System.out.println("hello world");
    }
}
