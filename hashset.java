import java.util.*;

public class hashset{
    public static void main(String args[])
      {
        Hashset<Integer> hs=new Hashset<>();
        Scanner sc=new Scanner(System.in);
        int A[]={2,2,3,3,3,4,5};
        int i;
        ArrayList<Integer> as=new ArrayList<>();
      for(i=0;i<A.length;i++)
      { 
        if(hs.contains(A[i]) && as.contains(A[i])==false)
        {
            as.add(A[i]);
        }
        else{
            hs.add(A[i]);
            }
      }
      hs.remove();
      as.remove();
      int b[]={1,1,1,2,2,3};
      for(i=0;i<A.length;i++)
      {
        if(hs.contains(b[i])&&as.contains(b[i]==flase))
        {
          //  as.add(b[i]);
            System.out.println(as.add(b[i]));
        }
        else{
      hs.add(b[i]);
       // System.out.println(hs.add(b[i]));
          }
    }
}