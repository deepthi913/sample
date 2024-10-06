import java.util.*;
import java.io.*;
class collectionsex1
{
    public static void main(String args[])
    {
        ArrayList<Integer> ai=new ArrayList<>();
        ai.add(10);
        ai.add(90);
        ai.remove(0);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.remove(10);
        System.out.println(ai);
        System.out.println(hs);
        HashMap<Integer,Integer> hm=new HashMap<>();

        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);

        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);


        if(!ai.contains(10))
        {
            System.out.println("yes");
        }
        



        // ArrayList<String> list=new ArrayList<>();
        // list.add("abc");
        // list.add("def");
       // list.remove(0);
       //Character
       // System.out.println(list.get(1));
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter n");
        // for(int i=0; i<n; i++)
        // {
        //     int temp=sc.nextInt();
        //     list.add(temp);
        // }
        // for(int a:list)
        // {
        // }
        // HashSet<Character> set=new HashSet<>();
        // set.add('a');
        // set.add('b');
        // set.add('c');
        // set.add('a');
        // set.add('a');
        // System.out.println(set.size());
       // System.out.println(!set.contains('a'));
        // for(char a:set)
        // {
        //     System.out.println(a);
        // }

    }
}