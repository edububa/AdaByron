import java.util.Scanner;

public class FinDeMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; i--) {
            if (sc.nextInt() + sc.nextInt() >= 0)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

// import java.io.*;

// public class FinDeMes {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
//         String line = bi.readLine();
//         for (int i = Integer.parseInt(line); i > 0; i--) {
//             line = bi.readLine();
//             String[] sArr = line.split("\\s");
//             if (Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]) >= 0)
//                 System.out.println("SI");
//             else
//                 System.out.println("NO");
//         }
//     }
// }
