// package singlyLL;
// package linkedlist;

// import java.util.LinkedList;

public class implementation {
    public static class Node { // Node class
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist { // ll datatype
        Node head = null;
        Node tail = null;

        int getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }

        void insertAtIndex(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void insertAtHead(int val) { // fn for insertion
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            }

            else {
                temp.next = head;
                head = temp;
            }

        }

        void insertAtEnd(int val) { // fn for insertion
            Node temp = new Node(val);
            if (head == null) {
                head = temp;}
                // tail = temp;
            // } else {
            //     tail.next = temp;
                // tail = temp;
            // }
            else{
            while(head.next!=null){
                head=head.next;
            }
            head.next=temp;}
            tail = temp;
        }

        void display() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.add(4);
        // ll.add(5);
        System.out.println(ll.size());
        ll.insertAtEnd(10);
        ll.display();

        ll.insertAtEnd(5);
        ll.display();

        System.out.println(ll.size());

        ll.insertAtHead(13);
        ll.display();

        ll.insertAtHead(2);
        ll.display();
        ll.insertAtIndex(3, 6);
        ll.display();
        System.out.println(ll.getAt(3));

        ll.deleteAt(2);
        ll.display();
    }
}
