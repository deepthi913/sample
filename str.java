import java.util.*;

public class str
{

static char[] reverse(String s)
{

char c[]=s.toCharArray();
char ch;

for(int i=0;i<c.length/2;i++)
{
    ch=c[i];
    c[i]=c[c.length-i-1];
    c[c.length-i-1]=ch;
}
return c;

}
public static void main(String args[])
{  
String s="sivadeepthi";
char []c=s.toCharArray();
c[0]='a';
for(int i=0;i<c.length;i++)
{
    System.out.print(c[i]);
}
System.out.println("\n");
char A[]=reverse(s);

for(int i=0;i<A.length;i++)
{

    System.out.print(A[i]);
}
}
}