import java.util.Scanner;
public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; i--) {
            int nValles = 0;
            int nPicos = 0;
            int[] temperaturas = new int[sc.nextInt()];
            for (int j = 0 ; j < temperaturas.length; j++) {
                temperaturas[j] = sc.nextInt();
            }
            for (int j = 1; j < temperaturas.length - 1; j++) {
                if (temperaturas[j - 1] < temperaturas[j] && temperaturas[j] > temperaturas[j + 1])
                    nPicos++;
                if (temperaturas[j - 1] > temperaturas[j] && temperaturas[j] < temperaturas[j + 1])
                    nValles++;
            }
            System.out.println(nPicos + " " + nValles);
        }
    }
}
