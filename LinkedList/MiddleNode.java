package LinkedList;
import java.util.*;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class MiddleNode {
    public static ListNode insertAtEnd(ListNode head,int val)
    {
        ListNode newNode = new ListNode(val);
        if(head==null)
        {
            return newNode;
        }

        ListNode temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;

        }

        temp.next = newNode;
        return head;
    }
    // display linkedlist
    public static void display(ListNode head)
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.println(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static ListNode middleNode(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
             slow = slow.next;
             fast = fast.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = null;
        System.out.println("Enter no. of nodes ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + "elements: ");
        for(int i=0;i<n;i++)
        {
             int value = sc.nextInt();
             head = insertAtEnd(head,value);
        }
        System.out.println("\nLinkedList : ");
        display(head);

        ListNode middle = middleNode(head);

        System.out.println("Middle node : " + middle.val);

        sc.close();

    }
}
