import java.util.*;
public class k_multiples {
    static void mul(int n, int k){
        if(k==1){
            System.out.print(n+" "); 
            return;
        }
       // System.out.print(n*k+" ");
        mul(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        mul(n, k);
    }
}
