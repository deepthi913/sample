import java.util.*;


public class  square
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  n value:");
        int n=sc.nextInt();

        int count=0;

        for(int i=1;i<=n;i++)
        {

            for(int j=i;j<=(n+count);j++)
            {

                System.out.print(j+" ");
            }
            count++;
            System.out.println();
        }



    }



}