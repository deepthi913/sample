import java.util.*;
class parent
{
    public parent()
    {
        System.out.println("parent");
    }
    parent(int x){
        System.out.println("double parent");
    }
}
class child extends parent
{
public child()
{
    System.out.println("child");
}
child(int x)
{
   // super(x);
    System.out.println("double child");
}
}
class grandchild extends child{
 public grandchild(int c)
 {
      super(c);
    System.out.println("grand child");
 }
}
public class ic
{
    public static void main(String args[])
    {
        grandchild g=new grandchild(60);
    }
}