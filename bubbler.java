import java.util.*;

class bubbler
{  

            
            
    static int[] bubbler(int A[],int n,int i)
    {
        if(n==0)
        {
            return A;
        }

    if(i<n)
    {
         if(A[i]>A[i+1])
         {
             int temp=A[i];
             A[i]=A[i+1];
             A[i+1]=temp;
         }
        return bubbler(A,n,i+1);
    }
    else
    {
      return bubbler(A,n-1,0);
    }
    }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        for(int i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
        }
        int n=A.length;
        int b[]=bubbler(A,n-1,0);
        for(int i=0;i<5;i++)
        {
            System.out.print(b[i]+" ");
        }
        





      }






}