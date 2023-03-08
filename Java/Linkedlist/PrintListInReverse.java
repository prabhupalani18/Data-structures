package Linkedlist;

//* Given a singly linked list, print all elements in reverse.
//* Time complexity - O(n), Space complexity - O(n)

public class PrintListInReverse {

    public static class Node{
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }

    public static Node createList(int n)
    {
        Node head=new Node(1);
        Node current=head;
        for(int i=2;i<=n;i++)
        {
            current.next=new Node(i);
            current=current.next;
        }
        return head;
    }

    public static void printListInReverse(Node n) //Using recursion, printing list in reverse.
    {
        if(n==null)
        {
            return;
        }
        else{
            printListInReverse(n.next);
            System.out.print(n.data+" --> ");
        }
    }

    public static void main(String[] args) {
        Node head = createList(5);
        printListInReverse(head);
    }
}
