import java.util.*;

public class fb
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        System.out.println("select the String");
        String s2=sc.nextLine();
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        for(i=0;i<s1.length();i++)
        {
            if(j<s2.length() && s1.charAt(i)==s2.charAt(j))
            {
                if(s1.charAt(i)=='a')
                {
                    s.append('z');
                    j++;
                    continue;
                }
                int ch=s1.charAt(i)-1;
                s.append((char)ch);
                j++;
            }
            else{
                s.append(s1.charAt(i));
            }
        }
     
       System.out.println(s);
    }}
    //     Scanner sc=new Scanner(System.in);
    //     // int input=sc.nextInt();
    //     // System.out.println(fbb(input));
    //     int A[]={1,2,2,3,3,3,2};
    //    // int c=sc.nextInt();
    //     HashMap<Integer,Integer> hm=new HashMap<>();
    //     for(int i=0;i<A.length;i++)
    //     {
    //         hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            
    //     }
    //     int count=0;
    //     for(int i:hm.keySet())
    //     {
    //         count++;
    //         if(count==3)
    //         {
    //             System.out.println(i);
    //             System.out.println(hm.get(i));
    //             break;
    //         }
    //     }
    // }
   /* static int fbb(int input)
    {
        int a=0;
        int b=1;
        if(input==1)
        {
            return 1;
        }
        if(input==0)
        {
            return 0;
        }
      //  int c=a+b;

        for(int i=2;i<=input;i++)
        {
           int c=a+b;
            if(i==input)
            {
                return c; 
            }
            a=b;
            b=c;
        }
        
      return 0;

    }*/

