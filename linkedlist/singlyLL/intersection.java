// import org.w3c.dom.Node;

public class intersection {

    public static class Node {
        int data;
        Node next;
    

        Node(int data) {
            this.data = data;
        }
    }
 
 
public class Solution {

    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp=headA;
        Node t=headB;
        int m=0;
        int n=0;
        
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        while(t.next!=null){
            n++;
            t=t.next;
        }
        if(n<m){
            for(int i=1;i<=m-n;i++){
            temp=temp.next;
            }
        }
        else{
            for(int i=1;i<=n- m;i++){
            t=t.next;
        }
            
        }
        
        while(temp!=t){
            temp=temp.next;
            t=t.next;
        }
        return temp;
        
        
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
    }
    
}
