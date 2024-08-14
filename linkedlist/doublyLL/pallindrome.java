public class pallindrome {
    public static class Node {
        int data;
        Node next;
        Node prev;
        int size;

        Node(int data) {
            this.data = data;
        }
    }

    // static boolean isPallindrome(Node head){
    // Node temp=head;
    // while(temp!=null){
    // temp=temp.next;
    // }
    // Node tail=temp;
    // while(head!=tail){
    // if(head.data!=tail.data){
    // return false;
    // }
    // head=head.next;
    // tail=tail.prev;
    // }
    // return true;
    // }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(3);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println(a.data);

        Node temp = a;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node tail = temp;
        while (a != tail) {
            if (a.data != tail.data) {
                System.out.println(false);
            }
            else{ System.out.println(true);}
            a = a.next;
            tail = tail.prev;
        }
        

    }
}