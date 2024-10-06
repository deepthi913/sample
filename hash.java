import java.util.*;
import java.io.*;

public class hash{
    public static void main(String args[])
    {
//   HashMap<Character,Integer> hm = new HashMap<>();
//    Scanner sc=new Scanner(System.in);
//     String s1=sc.nextString();
//     for(int i=0;i<s1.length();i++)
//     {        if(hm.containskey(s1.charAt(i)==true))
//         {
//             hm.put(s1.charAt(i),hm.get(s1.charAt(i)+1));
//         }
//         else{
            
//             hm.put(s1.charAt(i),1);
//             }
//     }
//     int largest=0;
//     char ch='0';

//         //System.out.println(hm.isEmpty());
//         // }
//     for(Map.Entry<Character,Integer>map:hm.entrySet())
//     {
//         if(hm.getValue()>largest)
//         {
//             ch=hm.getKey();
//             largest=hm.getValue();
//         }
//     }
//     System.out.println(ch);

//     }
// HashMap<Integer,Integer> hm=new HashMap<>();
// Scanner sc=new Scanner(System.in);
// int A[]=new int[5];
// for(int i=0;i<5;i++)
// {
//     A[i]=sc.nextInt();
// }
// for(int i=0;i<5;i++)
// {

//     hm.put(A[i],hm.getOrDefault(A[i],0)+1);
// }
// for(Map.Entry<Integer,Integer> map:hm.entrySet())
// {

//     if(map.getValue()>1)
//     {
//         System.out.println(map.getKey());
//     }
// }

Hashset<Integer> hs=new Hashset<>();
Scanner sc=new Scanner(System.in);
int A[]=new int[5];
int i;
for(i=0;i<A.length;i++)
{
    A[i]=sc.nextInt();
    hs.add(A[i]);
}
// for(int i=0;i<A.length;i++)
// {
//     hs.add(A[i]);
// }
for(i=0;i<A.length;i++)
{
    System.out.println(hs.get(i));
}
}
}