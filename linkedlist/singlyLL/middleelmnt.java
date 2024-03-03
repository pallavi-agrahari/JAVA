public class middleelmnt {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static int middleElement(Node head){
        Node slow=head;
        Node fast=head;
        int length=0;
        while(slow!=null){
            length++;
            slow=slow.next;
        }
        slow=head;
        if(length%2==0){
            while(fast!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
        }
        else{
            while(fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
        }
        return slow.data;
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
        System.out.println(middleElement(a));

    }
    
}
 