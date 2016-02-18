import java.util.*;

public class TIA {
    private String analize(int[] inputArr) {
	
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	String result = "";
	while (n != 0) {
	    n = sc.nextInt();
	    int[] inputArr = new int[n + 1];
	    for (int i = 0; i < inputArr.length; i++) {
		inputArr[i] = sc.nextInt;
	    }
	    result += analize(inputArr) + "\n";
	}
	System.out.println(s);
    }
}
