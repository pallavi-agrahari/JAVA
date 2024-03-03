import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("key is present at ");
        } else {
            System.out.println("key is absent");
        }

    }
}
