import java.util.*;
public class dl
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of elements you want");
    int n=sc.nextInt();
    int data=sc.nextInt();
    Node head=new Node(data);
    Node last=head;
    for(int i=1;i<n;i++)
    {
      data=sc.nextInt();
      Node temp=new Node(data);
      temp.prev=head;
      last.next=temp;
      last=temp;
    }
    System.out.println("created linked list");
    display(head);
  head=insert_begin(head);
   display(head);
   insert_after(head);
   display(head);
   insert_end(head);
   display(head);
   head=delete_begin(head);
   display(head)l
   delete_after(head);
   display(head);
   delete_end(head);
   display(head);
  // reverse_linkedlist(head);

}
static void display(Node temp)
{
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
static Node getnode()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the newnode data");
    int data=sc.nextInt();
    Node newnode=new Node(data);
    return newnode;
}
static Node insert_begin(Node temp)
{
Node newnode=getnode();
newnode.next=temp;
temp=newnode;
return temp;
}
static void insert_after(Node temp)
{
Node newnode=getnode();
Scanner sc=new Scanner(System.in);
int val=sc.nextInt();
while(temp.data!=val)
{
temp=temp.next;
}
newnode.next=temp.next;
newnode.prev=temp;
temp.next=newnode;
newnode.next.prev=newnode;
}
static void insert_end(Node temp)
{
Node newnode=getnode();
 while(temp.next!=null)
 {
    temp=temp.next;
 }
 temp.next=newnode;
 newnode.prev=temp;
}
}
static Node delete_begin(Node temp)
{
    temp=temp.next;
    temp.prev=null;
    return temp;
}
static void delete_after(Node temp)
{
    Scanner sc=new Scanner(System.in);
    int val=sc.nextInt();
    while(temp.data!=val)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;
}
static void delete_end(Node temp)
{
while(temp.next!=null)
{
    temp=temp.next;
}
temp.prev.next=null;
}
}

class Node
{
    Node prev;
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}