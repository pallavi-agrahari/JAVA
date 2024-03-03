public class twosum {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static void twoSum(Node head, int target) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println(temp.data);
        }
        Node tail = temp;
        while (head.data < tail.data) {
            if (head.data + tail.data == target) {
                System.out.println("present");
                return;
            } else if (head.data + tail.data > target) {
                tail = tail.prev;
            } else {
                head = head.next;
            }
            System.out.println("absent");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(3);
        Node c = new Node(6);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;

        twoSum(a, 9);
    }

}
