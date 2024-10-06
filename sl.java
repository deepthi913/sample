import java.util.*;
public class sl
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in );
    int n=sc.nextInt();
    int data=sc.nextInt();
    Node head=new Node(data);
     
     Node move=head;
     for(int i=1;i<n;i++)
     {
        data=sc.nextInt();
        Node temp=new Node(data);
        move.next=temp;
        move=temp;
     }
     display(head);
     delete_before(head);
     display(head);
   }
   static void display(Node head)
   {
     Node temp=head;
     while(temp!=null)
     {
        System.out.print(temp.data+" ");
        temp=temp.next;
     }
    

   }
static void delete_before(Node head)
{
    Node temp=head;
    Scanner sc=new Scanner(System.in);
    int val=sc.nextInt();
    Node prev=null;
    while(temp.next.data!=val)
    {
        prev=temp;
        temp=temp.next;
    }
    prev.next=temp.next;
}
}
class Node{
    int data;
    Node next;
      
      Node(int data)
      {
        this.data=data;
        this.next=null;
      }

}