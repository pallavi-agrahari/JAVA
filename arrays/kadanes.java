import java.util.*;
public class kadanes {
    public static int maxSubArray(int a[]){
        int max_so_far=Integer.MIN_VALUE;
        int max_end=0;
        for(int i=0;i<a.length;i++){
            max_end=max_end+a[i];
            if(max_so_far<max_end){
                max_so_far=max_end;
            }
            if(max_end<0){
                max_end=0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxSubArray(arr);
        System.out.println(ans);
    }
    
}
