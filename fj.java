import java.util.*;

public class fj
{
    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>();
       // ArrayList<Integer> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int B[]=new int[5];

        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
            hs.add(A[i]);

        }
        for(int i=0;i<A.length;i++)
        {
            B[i]=sc.nextInt();
            hs.add(B[i]);

        }
        System.out.println("union elements are");

        for(int c:hs)
        {
            System.out.println(c);
        }
        // for(int c:A)
        // {
        //     hs.add(c);
        // }
        // for(int c:B)
        // {
        //     hs.add(c);
        // }
        // for(int c:hs)
        // {
        //     al.add(c);
        // }
        // System.out.println(al);


    }

}
// {
// static int a=10;
// public static void main(String args[])
// {
// fj dd=new fj();
// fj da=new fj();
// da.a=9;
// System.out.println(dd.a);
// }
     // static ArrayList<Integer> fun(int n)
    // {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     for(int i=1;i<=n;i++)    //     {
    //         int count=0;
    //         for(int j=1;j<=i;j++)
    //         {
    //             if(i%j==0)
    //             {
    //                 count++;
    //             }
    //         }
    //         if(count==2)
    //         {
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }
    // public static void main(String args[])
    // {
    //     ArrayList<Integer> al=new ArrayList<>();
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     al=fun(n);
    //     System.out.println(al);
    // }
