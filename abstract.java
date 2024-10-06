import java.util.*;
abstract class hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
   // abstract void 
}
class myhospital extends hospital{
    public myhospital()
    {
        System.out.println("myhospital");
    }
    public void emergency()
    {
        System.out.println("emergency");
    }
    public void appointment()
    {
        System.out.println("appointment");
    }
    public void admit()
    {
        System.out.println("admit");
    }
}
public class abstract{
    public static void main(String args[])
    {
        hospital h=new myhospital();
     //   myhospital s=new myhospital();
        h.admit();
    }
}