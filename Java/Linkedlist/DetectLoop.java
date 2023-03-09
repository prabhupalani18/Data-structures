package Linkedlist;

//* Given a singly linked list, find if the linked list contains a loop.
//* Time complexity - O(n), Space complexity - O(1)

public class DetectLoop {

    public static class Node
    {
        int data;
        Node next;

        Node(int n)
        {
            data=n;
            next=null;
        }
    }
    Node head;

    public static boolean detectLoop(Node head)
    {
        if(head==null)
        {
            return false;
        }
        else{
            Node current=head;
            Node nextNode=current.next;
            while(current!=null && current.next!=null)
            {
                current=current.next.next;
                nextNode=nextNode.next;

                if(current==nextNode)
                {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DetectLoop dl = new DetectLoop();
        dl.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        
        dl.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        five.next = three;
        boolean result = detectLoop(dl.head);
        if(result)
        {
            System.out.println("Linked list contains loop");
        }
        else{
            System.out.println("Linked list doesn't contain loop");
        }
    }
}
