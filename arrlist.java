import java.util.*;


public class arrlist{
    public static void main(String args[])
    {
        ArrayList<Integer> arrlist = new ArrayList<>();
     //   arrlist.add(10);
       // System.out.println(arrlist.get(0));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,flag=0;
        for(i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            arrlist.add(temp);
        }

        System.out.println("enter searching element");
        int sea=sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;

            if(arrlist.get(mid)==sea)
            {
                flag=1;
                break;
            }
            else if(arrlist.get(mid)<sea)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(flag==1)
        {
            System.out.println("element is found");
        }
        else{
            System.out.println("element  is not found");
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arrlist.get(i));
        // }

      // arrlist.add("sivadeepthi");

    //   System.out.println(arrlist.get(0));
    }
}


