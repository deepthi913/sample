import java.util.*;
public class primer
{
    
        static int strong(int n)
        {

            if(n==0)
            {
                return 0;
            }
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            return fact+strong(n/10);
     }
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
      //  int sum=0;
        if(n==strong(n))
        {
            System.out.println(n+" is an strong number");
        }
        else{
            System.out.println(n+" is not an strong number");
        }
     }

}