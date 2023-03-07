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
        Node nd = new Node(n);
        if(head==null)
        {
            head=nd;
            return head;
        }
        else{
            Node temp=head;
            while(pos>1)
            {
                temp=temp.next;
            }
            nd.next=temp.next;
            temp.next=nd;
            return head;
        }
    }

    public static int getSize(Node head)
    {
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
    }
    
}
