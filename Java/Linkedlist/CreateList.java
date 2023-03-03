package Linkedlist;

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

    public static void main(String[] args) {
        CreateList list = new CreateList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;

        printList(list.head);
    }
    
}
