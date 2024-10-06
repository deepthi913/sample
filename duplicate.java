import java.util.*;

public class duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int A[]=new int[10];
       // int B[]=new int[5];
       for(int i=0;i<A.length;i++)
       {
        A[i]=sc.nextInt();
       }
       for(int i=0;i<A.length;i++)
       {
        hm.put(A[i],hm.getOrDefault(A[i],0)+1);
       }
       System.out.println("duplicate elements removed");
       for(Map.Entry<Integer,Integer> map:hm.entrySet())
       {
        if(map.getValue()==1)
        {
            System.out.println(map.getKey());
        }
       }
    }
}