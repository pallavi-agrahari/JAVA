import java.util.*;

public class sum_subset {
    
    public static void subsetSum(int arr[],int n,int i,int sum) {
        if(i==n){
           System.out.println(sum);
           return;
        }
        //curr idx+sum
        subsetSum(arr, n, i+1, sum+arr[i]);

        //curr ans
        subsetSum(arr, n, i+1, sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subsetSum(arr, n, 0, 0);
    }
}
