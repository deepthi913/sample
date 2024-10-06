import java.util.*;

public class intersection
    {
    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int B[]=new int[5];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
            hs.add(A[i]);
        }
        for(int i=0;i<B.length;i++)
        {
            B[i]=sc.nextInt();
        }
        for(int c:B)
        {
            if(hs.contains(c))
            {
                al.add(c);
                hs.remove(c);
            }
        }
        System.out.println("intersection elements are");
        System.out.println(al);
    }
}