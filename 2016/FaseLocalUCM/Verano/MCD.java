public class MCD {
    public static void main(String[] args) {
        int[] n0 = {72, 108, 60};
        int[] n1 = {54, 90};
        int mcd0 = 0;
        int mcd1 = 0;
        for (int i : n0) {
            mcd0 = MCDfunc(mcd0, i);
        }
        for (int i : n1) {
            mcd1 = MCDfunc(mcd1, i);
        }
	System.out.println(mcd0);
	System.out.println(mcd1);

    }

    private static int MCDfunc(int a, int b) {
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
                a = MCDfunc(b, r);
            }
        }
        if (a < b) {
            c = b / a;
            r = b % a;
            if (c != 0) {
                a = MCDfunc(a, r);
            }
        }
        return a;
    }
}
