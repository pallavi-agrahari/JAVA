import java.util.*;
public class substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = st.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(st.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
