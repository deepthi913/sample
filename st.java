import java.util.*;

public class st
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("enter the String");
        String s=sc.nextLine();
        System.out.println("select the String");
        String s1=sc.nextLine();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(j<s1.length() && s1.charAt(j)==s.charAt(i))
            {
                if(s.charAt(i)=='a')
                {
                    sb.append('z');
                    j++;
                    continue;

                }
                int ch=s.charAt(i)-1;
                sb.append((char)ch);
                j++;
        
            }
            else
            {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);

    }
}