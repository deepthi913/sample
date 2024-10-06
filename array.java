import java.util.*;

public class array{

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[50][50];
    int b[][]=new int[50][50];
    int n=sc.nextInt();
+
    int i,j;

    for( i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
    for(i=0;i<n;i++)
    {
    
        for(j=0;j<n;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            int sum=0;
            for(int m=0;m<n;m++)
            {
                
                for(int k=0;k<n;k++)
                {
                    sum=sum+a[i][j]*b[k][m];
                }
            }
            System.out.print(sum+" ");
        }
        System.out.println("\n");
    }



}


}