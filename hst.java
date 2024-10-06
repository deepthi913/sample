import java.util.*;
public class hst
{
    public static void main(String args[])
    {
    //     HashSet<Integer> hs=new HashSet<>();
    //    ArrayList<Integer> al=new ArrayList<>();
    //      Scanner sc=new Scanner(System.in);
    //       int A[]=new int[5];
    //       int B[]=new int[5];
    //     for(int i=0;i<A.length;i++)
    //     {
    //         A[i]=sc.nextInt();
    //         hs.add(A[i]);
    //     }
    //     for(int i=0;i<B.length;i++)
    //     {
    //         B[i]=sc.nextInt();
    //        hs.add(B[i]);
    //     }
            
        // for(int i=0;i<hs.size();i++)
        // {
        //     System.out.println(hs.get(i));
        // }
    //     for(int c:hs)
    //     {
    //         al.add(c);
    //     }
    //   //  System.out.println(al);
    //     System.out.println("union elements are\n");

    //     for(int i=0;i<al.size();i++)
    //     {
    //         System.out.println(al.get(i));
    //     }
       int largest=0;
       char ch='a';
    HashMap<Character,Integer> hm=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextString();
    for(int i=0;i<s1.length();i++)
    {
        hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
    }
    for(Map.Entry<Character,Integer> map:hm.entrySet())
    {
        if(map.getValue()>largest)
        {
            largest=map.getValue();
            ch=map.getKey();
        }
    }
    System.out.println(ch);

    }

}
