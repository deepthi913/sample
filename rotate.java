import java.util.*;

public class rotate
{
    public static void main(String[] args)
    {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
       // Collections.rotate(al,1);
        Collections.rotate(al,2);
        System.out.println(al);

    }
}