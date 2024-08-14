public class maxmin {
    
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }
    static int maxima(Node head){
        Node temp=head;
        Node c;
        int maxima=temp.data;
        int minima=temp.data;
        if(temp.next.data<maxima && temp.prev.data<maxima){
            c=temp;
            
        }
        else if(temp.next.data>minima && temp.prev.data>minima){
            c=temp;
        }
        temp=temp.next;
        return 0;

    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(5);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(7);
        Node g=new Node(8);
        Node h=new Node(9);
        Node i=new Node(1);
        Node j=new Node(10);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;


    }
}
