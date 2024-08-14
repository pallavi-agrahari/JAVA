
//package sliding window;
import java.util.*;

public class max_consec_ones {

    public static int optimized(int arr[], int k){
        int maxlen=0;
        
        return maxlen;
    }

    public static int iterative(int arr[], int k) {
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeroes = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0) {
                    zeroes++;
                    if (zeroes <= k) {
                        int len = j - i + 1;
                        maxlen = len > maxlen ? len : maxlen;
                    } else {
                        break;
                    }
                }
            }
        }
        return maxlen;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(iterative(arr, 2));
        System.out.println(optimized(arr, 2));
    }

}
