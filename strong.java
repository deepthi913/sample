import java.util.*;

public class strong 
{   
     static void strong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;

            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+" is a strong number");
            //return true;
        }
        else{
            System.out.println(temp+" is not a strong number");
            //return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        strong(n);

       // int temp=n;
    //    for(int i=1;i<n;i++)
    //    {
    //     if(strong(i)){
    //         System.out.println(i);
    //     }
    //    }

    }
}