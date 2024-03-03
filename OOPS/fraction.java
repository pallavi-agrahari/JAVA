public class fraction {
    static int gcd(int num, int deno) {
        if (deno == 0) {
            return num;
        }
        return gcd(deno, num % deno);

    }

    static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.deno + f2.num * f1.deno;
        int denominator = f1.deno * f2.deno;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static class Fraction {

        int num;
        int deno;

        public Fraction(int num, int deno) {
            this.num = num;
            this.deno = deno;
            simplify();
        }

        public void simplify() {
            // if(num<deno){
            // deno=deno/num;
            // num=1;
            // }
            // else{
            // num=num/deno;
            // deno=1;
            // }
            int hcf = gcd(num, deno);
            num /= hcf;
            deno /= hcf;

        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(14, 35);
        System.out.println(f1.num + "/" + f1.deno);
        // f1.simplify();
        // System.out.println(f1.num+"/"+f1.deno);
        Fraction f2 = new Fraction(7, 3);
        Fraction f3 = add(f1, f2);

        System.out.println(f3.num + "/" + f3.deno);
    }

}
