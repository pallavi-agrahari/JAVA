import java.util.*;

public class keypad {
    static void keyPadCombination(String st, String[] kp, String ans) {// "253"--kp[2]
        if (st.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        // 2="2"-'0'
        int currNum = st.charAt(0) - '0';
        String currChoices = kp[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            keyPadCombination(st.substring(1), kp, ans + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        // 0 1 2 3 4 5 6 7 8 9
        keyPadCombination(st, kp, "");
    }
}
