import java.util.*;
public class alternate_sign {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0)
        return sum(n-1)-n;
        else return sum(n-1)+n;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    
}
