import java.util.*;
public class frog {
    static int frog_jump(int h[],int n,int i){
        if(i==n-1){
            return 0;
        }
        
        int op1=Math.abs(h[i]-h[i+1])+frog_jump(h, n, i+1);
        if(i==n-2){
            return op1;
        }
        int op2=Math.abs(h[i]-h[i+2])+frog_jump(h, n, i+2);
        return Math.min(op1,op2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(frog_jump(arr, n, 0));


    }
    
}
