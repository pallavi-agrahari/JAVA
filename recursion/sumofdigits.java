import java.util.*;
public class sumofdigits {
    static int SOD(int n){
        //basecase
        if(n>0 && n<10){
            return n;
        }
        //selfwork = recursive work + selfwork
        int ans=SOD(n/10)+n%10;
        return ans;
    }

    static int countDigit(int n){
        //base case
        if(n==0){
            return 0;
        }
        //recursive work + self work
        return countDigit(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SOD(n));
        System.out.println(countDigit(n));  
      }
}
