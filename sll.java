import java.util.*;
public class sll
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Node node=new Node();
    node.data=sc.nextInt();
    System.out.println(node.data);
    }
}
class Node
{
    int data;
    Node next;
    // Node(int data)
    // {
    //     this.data=data;
    //     this.next=null;
    // }
    // Node()
    // {
    //     this.next=null;
    // }
}