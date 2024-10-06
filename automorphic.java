import java.util.*;

public class automorphic{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=n*n;
        int flag=0;
        while(n>0)
        {
            if(n%10!=m%10)
            {
                flag=1;
                break;
            }
            n=n/10;
            m=m/10;
        }
        if(flag==1)
        {
            System.out.println("not automporphic number");
        }
        else{
            System.out.println("automorphic number");
        }
    }
}