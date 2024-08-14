// package singlyLL;

//package linkedlist;
import java.util.*;

public class basics {
    public static class Node {
        int data;
        Node next;
    

        Node(int data) {
            this.data = data;
        }
    }

    static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }

    static int length(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }
    static void display_recursively(Node a){
        while (a != null) {
            System.out.println(a.data);
            a = a.next;
        }
    }

    static void display(Node a) {
        Node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b;
        // 5->3 9 8 16
        b.next = c;
        c.next = d;
        d.next = e;
        // 5->3->9->8->16
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(b.data);
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        display(a);
        display_recursively(a);

        int l = length(a);
        System.out.println(l);

        insertAtEnd(a,4);
        display_recursively(a);

    }

}
