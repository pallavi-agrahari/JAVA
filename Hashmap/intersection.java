
import java.util.*;

public class intersection{
    public static int intersectionOfTwoArrays(int arr1[], int arr2[]) {
        int m = arr2.length;
        int n = arr1.length;
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < m; j++) {
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int ans=intersectionOfTwoArrays(arr1, arr2);
        System.out.println(ans);
}
}
