import java.util.*;

public class hs 
{
 
public static void main(String args[])
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int i;
        // for(i=0;i<A.length;i++)
        // {    
        //   map.put(A[i],hm.getOrDefault(A[i],0)+1);
        // }       
        // for(Map.Entry<Integer,Integer> map:map.entrySet())
////////// {          
        //}
        for(i=0;i<A.length;i++)
        {
            map.put(A[i],map.getOrDefault(A[i],1)*A[i]);

        }
        for(i=0;i<A.length;i++)
        {
            map.put(A[i],map.getOrDefault(A[i],1)*A[i]);
        }

        for(i=0;i<A.length;i++)
        {
          //  map.put(A[i],map.getOrDefault());
        }
        // for(i=0;i<A.length;i++)
        // {
        //     map.put(A[i],map.getOrDefault(A[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> map:map.entrySet())
        // {
        //     if(hm.getValue()%2==1)
        //     {
        //         System.out.println(hm.getkey());
        //         break;
        //     }
        // }


    }

}