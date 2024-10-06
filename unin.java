import java.util.*;
public class unin{
 public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // int A[]=new int[5];
        // int b[]=new int[5];
        // for(int i=0;i<5;i++)
        // {
        //     A[i]=sc.nextInt();
        //     b[i]=sc.nextInt();
        // }
        int A[]={1,2,3,45,2};
        int b[]={2,3,5,6,1};
        Hashset<Integer> hs=new Hashset<>();
    //    ArrayList<Integer> union=new ArrayList<>();
        for(int c:A)
        {
            hs.add(c);
        }
        for(int c:b)
        {
            hs.add(c);
        }
        for(int c:hs)
        {
            System.out.println("a and b union");
            System.out.println(c);
        }
    }
}