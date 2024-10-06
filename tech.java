import java.util.*;
public class tech{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int first=0,second=0;
      int count=0;
      while(n>0)
      {
        n=n/10;
        count++;
      }
      n=temp;
      int length=count/2;
      if(count%2==0){
        first=n%(int)Math.pow(10,length);
        second=n/(int)Math.pow(10,length);
      }
     /* else{
        System.out.println("not tech number")
      }*/
      int total=first+second;
      if(total*total==temp)
      {
        System.out.println("tech number");
      }
      else{
        System.out.println("not tech number");
      }
        
    }
}