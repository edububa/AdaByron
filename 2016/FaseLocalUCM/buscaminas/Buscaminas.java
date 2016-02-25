import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < tablero.length; i++) {
	    
        }
    }
}

// input
// 8 8
// -*---*--
// --------
// **------
// ---*----
// ---*---*
// -*--*---
// ----*---
// --------
// 4
// 1 1
// 1 8
// 8 8
// 8 1
// output
// 1XXXXX1-
// XXXX111-
// XXXX1---
// XXXX2-11
// XXXX311X
// XXXXX211
// 1112X2--
// ---1X1--
