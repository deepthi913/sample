import java.util.*;
public class primenumber
{

public static void main(String args[])
{
    ArrayList<Integer> al=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int m=sc.nextInt();
        al.add(m);
    }
    System.out.println("enter searching element");
    int sea=sc.nextInt();
    int flag=0;

    for(int i=0;i<al.size();i++)
    {

        if(sea==al.get(i))
        {
            flag=1;
            break;
        }
    }
    
    if(flag==1)
    {
        System.out.println("element is found");
    }
     else
     {
        System.out.println("element is not found");

     }



}



}