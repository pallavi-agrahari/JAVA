import java.util.*;
public class subsequence {
    static ArrayList<String>aL=new ArrayList<String>();
    public static void gss(String s, String ans) {
        if(s.length()==0){
           //System.out.println(ans);
           aL.add(ans);
            return;
        }
        //pick
        gss(s.substring(1), ans+s.charAt(0));
        gss(s.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        gss(s,"");
        System.out.println(aL);
    }
}
 