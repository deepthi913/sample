import java.util.*;

public class practice
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int B[]=new int[5];
        int i,j;
        for(i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
            B[i]=A[i];
        }
        for(i=0;i<4;i++)
        {           
            int flag=0;
            for(j=0;j<4-i;j++)
            {
                if(B[j]>B[j+1])
                {
                    int temp=B[j];
                    B[j]=B[j+1];
                    B[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(i=0;i<5;i++)
        {

            if(B[4]==A[i])
            {
                break;
            }
        }
        int n=i;
        for(i=0;i<5;i++)
        {
            if(B[3]==A[i])
            {
                break;
            }
        }
        int m=i;
        int l=0;
        System.out.println("index numbers is "+n+" "+m);
        int largest=0;
        for(i=0;i<5;i++)
        {
            int count=0;
            for(j=0;j<5;j++)
            {
                if(A[i]==A[j])
                {
                    count++;
                }
            }
            if(count>largest)
            {
                largest=count;
                l=A[i];
            }
        }
        if(largest==1)
        {
            System.out.println("repeating elements are not there");

        }
        else{
        System.out.println("repeating element is "+l);
        }

    }
    
}