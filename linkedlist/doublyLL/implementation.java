public class implementation {
    
    public static class Node {
        int data;
        Node next;
        Node prev;
       
        Node(int data) {
            this.data = data;
        }
    }

    public static class doublyll {
        

        void displayHead(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayTail(Node tail) {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        void displayRandom(Node idx) {
            Node temp = idx;
            // move this temp backwards to head
            while (temp.prev != null) {
                temp = temp.prev;
            }
            // now temp is at head
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(Node head) {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        static void insertAtEnd(Node head,int val){
            Node temp=new Node(val);
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
            temp.prev=t;
            t=temp;;
        }

        static Node insertAtHead(Node head,int val){
            Node temp=new Node(val);
            Node t=head;
            while(t.prev!=null){
                t=t.prev;
            }
            temp.next=t;
            t.prev=temp;
            t=temp;
            return t;
        }

        void insertAtIndex(Node head,int idx,int val){
            Node temp=new Node(val);
            Node t=head;
            for(int i=0;i<idx-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
            temp.prev=t;
        }

        void deleteAt(Node head,int idx){
            
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(7);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        doublyll dll = new doublyll();
        dll.displayHead(a);
        dll.displayTail(c);
        dll.displayRandom(b);
        System.out.println(dll.size(a));
        dll.insertAtEnd(c,4);
        dll.displayHead(a);
        Node newhead=dll.insertAtHead(c,9);
        dll.displayHead(newhead);
        System.out.println(dll.size(newhead));
        dll.insertAtIndex(newhead,2, 30);
        dll.displayHead(newhead);
    }
}
