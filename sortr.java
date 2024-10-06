import java.util.*;


public class sortr
{


    static ArrayList<Integer> find(int A[],int i,int target)
    {
        
        if(A.length==i)
        {
            return al;
        }
        if(A[i]==target)
        {
            al.add(i);
        }
        return find(A,i+1,target);

    }
   /* static boolean issort(int A[],int i)
    {
        if(i==A.length-1)
        {
            return true;
        }
        if(A[i]>A[i+1])
        {
            return false;
        }
        return issort(A,i+1);
    }*/
    public static void main(String args[])
    {
        int A[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
     //   ArrayList<Integer> ai=new ArrayList<>();
       // ArrayList<Integer> list=new ArrayList<>();
        int target=sc.nextInt();
        list=find(A,0,target);
        System.out.println(list);     
    }
}