public class nodefromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        // mth node from start
        for (int i = 0; i < m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //imp for interview
    static Node nthNodeinoneTraversal(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    static void deleteNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
    }

    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
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
        Node q = nthNode(a, 3);
        System.out.println(q.data);
        System.out.println(nthNodeinoneTraversal(a,2).data);
        deleteNode(a, 4);
        display(a);


    }

}
