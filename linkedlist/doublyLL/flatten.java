public class flatten {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int data) {
            val = data;
        }
    }

    public static Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null)
                    t.prev = c;
            }
            temp.child = null;
            temp = t;
        }
        return head;

    }
    public static void printFlattenedList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.prev = a;
        a.next.next = new Node(3);
        a.next.next.prev = a.next;
        a.next.next.next = new Node(4);
        a.next.next.next.prev = a.next.next;
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.prev = a.next.next.next;
        a.next.next.next.next.next = new Node(6);
        a.next.next.next.next.next.prev = a.next.next.next.next;
        a.next.next.child = new Node(7);
        a.next.next.child.next = new Node(8);
        a.next.next.child.next.prev = a.next.next.child;
        a.next.next.child.next.next = new Node(9);
        a.next.next.child.next.next.prev = a.next.next.child.next;
        a.next.next.child.next.next.next = new Node(10);
        a.next.next.child.next.next.next.prev = a.next.next.child.next.next;
        a.next.next.child.next.child = new Node(11);
        a.next.next.child.next.child.next = new Node(12);
        a.next.next.child.next.child.next.prev = a.next.next.child.next.child.next;




        Node flattenedHead=flatten(a);

        printFlattenedList(flattenedHead);
    }
}
