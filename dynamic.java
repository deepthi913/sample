import java.util.*;
abstract class hospital{
    abstract void emergency();
    abstract void medicine();
}
class myhospital extends hospital{
    public void emergency()
    {
        System.out.println("hospital");
    }
    public void medicine()
    {
        System.out.println("medicine");
    }
}
public class dynamic{
    public static void main(String args[])
    {
        hospital h=new myhospital();
        h.emergency();
    }
}