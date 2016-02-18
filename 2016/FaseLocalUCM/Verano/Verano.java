import java.util.*;

public class Verano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        while (first != 0) {
            int second = first;
            LinkedList<Integer> inList = new LinkedList<Integer>();
            while (second != 0) {
                inList.addLast(second);
                second = sc.nextInt();
            }
            int total = 0;
            int mcd = 0;
            for (Integer i : inList) {
                mcd = MCD(mcd, i);
                total += i;
            }
            if (mcd != 0)
                System.out.println(total/mcd);
	    else
		System.out.println(0);
            first = sc.nextInt();
        }
        sc.close();
    }

    private static int MCD(int a, int b) {
        int r;
        int c;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b) {
            c = a / b;
            r = a % b;
            if (c != 0) {
                a = MCD(b, r);
            }
        }
        if (a < b) {
            c = b / a;
            r = b % a;
            if (c != 0) {
                a = MCD(a, r);
            }
        }
        return a;
    }
}
