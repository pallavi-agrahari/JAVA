import java.util.*;
public class natural_no {
    public static void printIncreasingNaturalNo(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        //recursive work
        printIncreasingNaturalNo(n-1);
       //self work
        System.out.print(n+" ");
       
    }

    static void printDecreasingNaturalNo (int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        
        System.out.print(n+" ");
        //recursive work
        printDecreasingNaturalNo(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasingNaturalNo(n);
        System.out.println();
        printDecreasingNaturalNo(n);
    }
}
