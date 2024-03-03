import java.util.*;

public class gcd {
    public static int GCD(int n,int m){
        if(m==0){
            return n;
        }
        return GCD(m,n%m);
    }

    
    static void iterative(int n,int m){
        while(n%m!=0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        System.out.println(m);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int gcd=GCD(n,m);
        System.out.println(gcd);
        iterative(n, m);
       int product=n*m;
       int lcm=product/gcd;
       System.out.println(lcm);
    }
    
    
}
