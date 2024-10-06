import java.util.*;

public class lil
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        ArrayList<Integer> all=new ArrayList<>();
        all.add(2);
        all.add(1);
        all.add(0);
      list.add(al);
      list.add(all);
      System.out.println(list);
      System.out.println(list.get(0));
      System.out.println(list.get(1).get(0));


    }
}