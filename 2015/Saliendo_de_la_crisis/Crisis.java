import java.util.Scanner;

public class Crisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nDatos = sc.nextInt();
        while (nDatos != 0) {
            int n0 = sc.nextInt();
            boolean r = true;
            for (int i = 0; i < nDatos - 1; i++) {
                int n1  = sc.nextInt();
                if (n0 >= n1)
                    r = false;
		n0 = n1;
            }
            if (r) {
                System.out.println("SI");
            } else
                System.out.println("NO");
            nDatos = sc.nextInt();
        }
        sc.close();
    }
}
