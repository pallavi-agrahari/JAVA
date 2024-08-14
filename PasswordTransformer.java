import java.util.*;

public class PasswordTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String firstPassword = scanner.nextLine();
        String secondPassword = scanner.nextLine();
        int KValue = scanner.nextInt();
        
        System.out.println(countTransformations(firstPassword, secondPassword, KValue));
    }

    public static int countTransformations(String firstPassword, String secondPassword, int KValue) {
        int N = firstPassword.length();

        if (firstPassword.equals(secondPassword) && KValue == 0) {
            return 1;
        }
        
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(firstPassword, 0));
        int waysCount = 0;

        while (!queue.isEmpty()) {
            State current = queue.poll();
            
            if (current.steps == KValue) {
                if (current.password.equals(secondPassword)) {
                    waysCount++;
                }
            } else if (current.steps < KValue) {
                for (int L = 1; L < N; L++) {
                    String newPassword = current.password.substring(N - L) + current.password.substring(0, N - L);
                    queue.offer(new State(newPassword, current.steps + 1));
                }
            }
        }
        
        return waysCount;
    }

    static class State {
        String password;
        int steps;
        
        State(String password, int steps) {
            this.password = password;
            this.steps = steps;
        }
    }
} 
