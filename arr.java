import java.util.*;

public class arr
{

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int A[][]=new int[5][5];
      //  int B[][]=new int[3][3];
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        int sum=0;

        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i==j||3-i-1)
                {
              sum=sum+A[i][j];
                }
                if(i==j&&3-i-1)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        System.out.println(sum);
    }

}