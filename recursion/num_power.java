import java.util.*;

public class num_power {
    // Time Complexity O(q)
   /*  static int power_of_num(int p, int q){
        //base case
        if(q==0){
            return 1;
        }
        //recursive work + selfwork
        return power_of_num(p, q-1)*p;
    }*/

    // Time Complexity O(log q)
    static int power_of_num(int p, int q){
        //base case
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int smallPow=power_of_num(p, q/2);
            return smallPow*smallPow;
        }
        else{
            int smallPow=power_of_num(p, q/2);
            return p*smallPow*smallPow;
        }
        
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(power_of_num(p, q));
    }
}
