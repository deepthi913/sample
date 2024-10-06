import java .util.*;

public class linked
{
    public static void main(String args[])
    {
       // int n;
        Scanner sc=new Scanner(System.in);
        int n;
        int data=sc.nextInt();
        n=sc.nextInt();     
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
        head=insertion_begin(head);    
        display(head);
       insertion_after(head);
        display(head);
      insertion_end(head);
        display(head);
        head=delete_begin(head);
        display(head);
        delete_after(head);
        display(head);
        delete_end(head);
        display(head);
    }
    static void display(Node temp)
    { 
      System.out.println("created linked list");
        while(temp!=null)
        {
       System.out.print(temp.data+" ");
       temp=temp.next;
        }
    }
    static Node insertion_begin(Node temp)
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter newnode data");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=temp;
        temp=newnode;
        return temp;
    }
    static void insertion_after(Node temp)
    {
        Scanner sc=new Scanner(System.in);
         // int data=sc.nextInt();
       System.out.println("enter the newnode data");
       int data=sc.nextInt();
         Node newnode=new Node(data);
         System.out.println("enter after insertin data");
         int val=sc.nextInt();
         while(temp.data!=val)
         { 
             temp=temp.next;
         }
         newnode.next=temp.next;
         temp.next=newnode;

    }
    static void insertion_end(Node temp)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the newnode data");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
      temp.next=newnode;
    }
    static  Node delete_begin(Node temp)
    {
    temp=temp.next;
    return temp;
    }
    static void delete_after(Node temp)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the after delete data");
        int val=sc.nextInt();
        while(temp.data!=val)
        {
         temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    static void delete_end(Node temp)
    {
        Node p=temp;
      while(temp.next!=null)
      {
        p=temp;
       temp=temp.next;
      }
      p.next=null;
    }
}
class Node
{
    int data;
    Node next;
    public Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}/*
class Node
{
int data;
Node next;
 public Node(int data1,Node next1)
 {
this.data=data1;
this.next=next1;
 }
 public Node(int data1)
 {
    this.data=data1;
    this.next=null;
 }
}*/
