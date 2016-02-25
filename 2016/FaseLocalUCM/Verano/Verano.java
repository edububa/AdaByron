import java.util.*;

public class Verano {
    private static int MCD(int a, int b) {
        int r;
        int c;
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b) {
            c = a / b;
            r = a % b;
            if (c != 0) {
		System.out.println("b: " + b);
		System.out.println("r: " + r);
                a = MCD(b, r);
            }
        }
        if (a < b) {
            c = b / a;
            r = b % a;
            if (c != 0) {
		System.out.println("a: " + a);
		System.out.println("r: " + r);
                a = MCD(a, r);
            }
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        while (first != 0) {
            int second = first;
            int total = 0;
            int mcd = 0;
            while (second != 0) {
                mcd = MCD(mcd, second);
                total += second;
                second = sc.nextInt();
            }
            System.out.println("total; " + total);
	    System.out.println("mcd: " + mcd);
            System.out.println(total/mcd);
            first = sc.nextInt();
        }
        sc.close();
    }
}
