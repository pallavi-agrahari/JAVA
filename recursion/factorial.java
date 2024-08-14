import java.util.*;

public class factorial {
    static int nFactorial(int n){
        if(n==1){
            
            return 1;
        }
        int ans=n * nFactorial(n-1);
        return(ans);
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nFactorial(n));
    }
}
