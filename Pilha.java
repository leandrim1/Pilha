public class Pilha {
     int[] elementos; 
     int topo; 

    public Pilha() {
        elementos = new int[10]; 
        topo = -1; 
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public void push(int elemento) {
        if (isFull()) {
            throw new RuntimeException("A pilha cheia!");
        }
        elementos[++topo] = elemento;
    }

    // Método para desempilhar (remover) um elemento
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha vazia!");
        }
        return elementos[topo--];
    }

    // Método para consultar o elemento no topo da pilha sem removê-lo
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException ("A pilha vazia!");
        }
        return elementos[topo];
    }
}
