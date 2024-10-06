import java.util.*;

public class has
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int search=sc.nextInt();
int A[]={2,3,5};
for(int i=0;i<A.length;i++)
{
    if(A[i]==search)
    {
        System.out.println("element is found");
        System.exit(0);
    }
}
System.out.println("element not found");
}
    
    

}