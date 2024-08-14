import java.util.*;

public class strings {
    static void removeOccurences(String st, int i, char ch) {
        // base case
        if (i == st.length()) {
            return;
        }
        // self work
        String ans = "";
        if (st.charAt(i) != ch) {
            // ans+=st.charAt(i);
            // System.out.print(ans);
            System.out.print(st.charAt(i));
        }
        // recursive work
        removeOccurences(st, i + 1, ch);
    }

    static String removeWithoutPassingIndex(String st, char ch) {
        // base case
        if (st.length() == 0) {
            return "";
        }

        // recursive work
        String smallAns = removeWithoutPassingIndex(st.substring(1), ch);

        // self work
        char currChar = st.charAt(0);
        if (currChar != ch) {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverseString(String st, int i) {
        // base case
        if (i == st.length()) {
            return "";
        }
        // recursive work
        reverseString(st, i + 1);
        // selfwork
        return reverseString(st, i + 1) + st.charAt(i);
    }

    static boolean isPallindrome(String st, int l, int r) {

        // self work
        if(l>=r){
            return true;
        }
        return (st.charAt(l) == st.charAt(r)&&isPallindrome(st, l + 1, r - 1));
            
        // recursive work
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch = sc.next().charAt(0);

        removeOccurences(st, 0, ch);
        System.out.println();

        System.out.println(removeWithoutPassingIndex(st, ch));

        System.out.println(reverseString(st, 0));

        String rev = reverseString(st, 0);
        if (rev.equals(st)) {
            System.out.println("palindromic string");
        } else {
            System.out.println("not palindrome");
        }

        System.out.println(isPallindrome(st, 0, st.length()-1));
    }
}
