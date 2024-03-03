import java.util.*;

public class array1 {
    static void printall(int arr[], int i) { // i=current index
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printall(arr, i + 1);
    }

    static int max_element(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int small = max_element(arr, i + 1);
        return Math.max(arr[i], small);
    }

    static int sum(int arr[], int i) {
        if (i == arr.length) {
            return 0;
        }
        return (arr[i] + sum(arr, i + 1));
    }

    static boolean linearSearch(int arr[], int x, int i) {
        if (i == arr.length) {
            return false;
        }
        if (arr[i] == x) {
            return true;
        }
        return linearSearch(arr, x, i + 1);
    }

    static int findIndex(int arr[], int x,int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == x) {
            return i;
        }
        return findIndex(arr, x, i + 1);
    }

    static void printAllIndices(int arr[], int x,int i){
        if (i == arr.length) {
            return;
        }
        if (arr[i] == x) {
            System.out.print(i+" ");
        }
        printAllIndices(arr, x, i + 1);
    }

    static ArrayList<Integer> AllIndices(int arr[], int x,int i){
        ArrayList<Integer> ans=new ArrayList<>();
        if (i == arr.length) {
            return ans;
        }
        if (arr[i] == x) {
            ans.add(i);
        }
        ArrayList<Integer> smallans=AllIndices(arr, x, i + 1);
        ans.addAll(smallans);
        return ans;
    }
    
//Write a Java recursive method to check if a given array is sorted in ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printall(arr, 0);
        System.out.println();

        System.out.println(max_element(arr, 0));

        System.out.println(sum(arr, 0));

        int x = sc.nextInt();
        System.out.println(linearSearch(arr, x, 0));

        System.out.println(findIndex(arr, x, 0));

        printAllIndices(arr, x, 0);

        ArrayList<Integer> ans= AllIndices(arr, x, 0);

        for(int i:ans){
            System.out.println(i);
        }


    }


}

