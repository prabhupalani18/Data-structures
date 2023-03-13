package Linkedlist;

import java.util.HexFormat;

//* Implement singly linkedlist using Node class
//* Time complexity - O(n), Space complexity - O(1)

public class CreateList {

    Node head;
    
    static class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }

    public static void printList(Node head)
    {
        System.out.println("Printing list");
        Node current = head;
        if(current==null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            while(current.next!=null)
            {
                System.out.print(current.data+" --> ");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    public static Node insertFirst(int n, Node head)
    {
        System.out.println("Inserting at first");
        Node nd = new Node(n);
        if(head==null)
        {
            head=nd;
        }
        else{
            nd.next=head;
            head=nd;
        }
        return head;
    }

    public static Node insertLast(int n, Node head)
    {
        System.out.println("Inserting at last");
        Node nd = new Node(n);
        if(head==null)
        {
            head=nd;
            return head;
        }
        else{
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=nd;
            return head;
        }
    }

    public static Node insertAtPosition(int n,int pos,Node head)
    {
        System.out.println("Inserting at given position");
        Node nd = new Node(n);
        if(head==null)
        {
            head=nd;
            return head;
        }
        else if(pos==1)
        {
            nd.next=head;
            head=nd;
            return head;
        }
        else{
            Node temp=head;
            while(pos>1)
            {
                temp=temp.next;
                pos--;
            }
            nd.next=temp.next;
            temp.next=nd;
            return head;
        }
    }

    public static int getSize(Node head)
    {
        System.out.println("Returning list size");
        if(head==null)
        {
            return 0;
        }
        else{
            int size=1;
            Node current=head;
            while(current.next!=null)
            {
                size++;
                current=current.next;
            }
            return size;
        }
    }

    public static Node insertMiddle(Node head,int val)
    {
        System.out.println("Inserting at middle");
        Node nd = new Node(val);
        if(head==null)
        {
            head=nd;
            return head;
        }
        else{
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            nd.next=slow.next;
            slow.next=nd;
            return head;
        }
    }

    public static Node deleteFirst(Node head)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return null;
        }
        else
        {
            System.out.println("Deleting at first");
            head=head.next;
            return head;
        }
    }

    public static Node deleteLast(Node head) {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return null;
        }
        else
        {
            System.out.println("Deleting at last");
            Node current=head;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
            return head;
        }
    }

    public static Node deleteAtPostion(Node head,int pos)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return null;
        }
        else if(pos==1)
        {
            System.out.println("Deleting at given position");
            head=head.next;
            return head;
        }
        else
        {
            System.out.println("Deleting at given position");
            Node current=head;
            while(pos>2)
            {
                current=current.next;
                pos--;
            }
            current.next=current.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        CreateList list = new CreateList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;

        printList(list.head);

        list.head = insertFirst(6, list.head);
        printList(list.head);

        list.head = insertLast(4, list.head);
        printList(list.head);

        list.head = insertAtPosition(8, 1, list.head);
        printList(list.head);

        int size = getSize(list.head);
        System.out.println(size);

        list.head = insertMiddle(list.head, 9);
        printList(list.head);

        list.head = insertMiddle(list.head, 7);
        printList(list.head);

        list.head = deleteFirst(list.head);
        printList(list.head);

        list.head = deleteLast(list.head);
        printList(list.head);

        list.head = deleteAtPostion(list.head,2);
        printList(list.head);
    }
    
}
