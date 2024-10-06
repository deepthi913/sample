import java.util.*;

public class union{

    public static void main(String args[])
       {
        
    Scanner sc=new Scanner(System.in);
    int A[]=new int[5];
    int B[]=new int[5];

    for(int i=0;i<A.length;i++)
    {
        A[i]=sc.nextInt();
    }
    for(int i=0;i<B.length;i++)
    {
        B[i]=sc.nextInt();
    }
    HashSet<Integer> hs=new HashSet<>();
    ArrayList<Integer> al=new ArrayList<>();

    for(int c:A)
    {
        hs.add(c);
    }

    
    }
}