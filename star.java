import java.util.*;

public class star
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,m;
     
    //  for(i=n;i>=1;i--)
    //  {

    //     for(j=1;j<=n-i;j++)
    //     {
    //         System.out.print(" ");
    //     }

    //     for(m=1;m<=i;m++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println("\n");
    //  }
    // }
    for(i=n;i>=1;i--)
    {

        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(m=1;m<=2*i-1;m++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    for(i=1;i<=n;i++)
    {

        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(m=1;m<=2*i-1;m++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }
    }
}