import java.util.*;

class cir{
    Scanner sc=new Scanner(System.in);
    public int radius;
    //radius=sc.nextInt();
    public int area()
    {
        radius=sc.nextInt();
        return (int)3.14*radius*radius;
    
    }
}
class cylinder extends cir{
    public int height;
    Scanner sc=new Scanner(System.in);
   // height=sc.nextInt();
    public int volume()
    {
        height=sc.nextInt();
        return area()*height;
    }
}
public class circle
{

    public static void main(String[] args){
    cir c=new cir();
    cylinder s=new cylinder();
    
    System.out.println("area of the circle "+c.area());
    System.out.println("area of the cylinder"+s.volume());

    }
    }