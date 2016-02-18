import java.util.*;

public class SinTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        while (j < 2) {
            Nodo[] nodoInput = new Nodo[sc.nextInt()];
            for (int i = 0; i < nodoInput.length; i++) {
                nodoInput[i] = new Nodo(sc.nextInt());
            }
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                nodoInput[sc.nextInt() - 1].links.put(sc.nextInt(), sc.nextInt());
            }
            j++;
        }
    }
}

class Nodo {
    private int peso;
    private boolean visto;
    private LinkedList<Tuple> aristas;

    public Nodo(int peso) {
        this.peso = peso;
        this.visto = false;
        this.aristas = new LinkedList();
    }

    public int getPeso() {
	return this.peso;
    }

    public boolean getVisto() {
	return this.visto;
    }
}

class Tuple {
    private int K;
    private int V;

    public Tuple(int K, int V) {
        this.K = K;
        this.V = V;
    }

    public int getK() {
        return this.K;
    }

    public int getV() {
        return this.V;
    }
}
