package atvrevisaofila;

/**
 *
 * @author Quiqu
 */
public class Fila<T> {
    
    private int inicio, fim, qtd;
    private T[] elementos;
    

    public Fila(int tamanho) {
        tamanho = 10;
        this.inicio=0;
        this.fim= -1;
        this.qtd=0;
        this.elementos= (T[]) new Object[tamanho];
    }
    
    boolean isFull(){
        return this.fim == this.elementos.length-1;
    }
    
    boolean enqueue(T elemento){
        if(!this.isFull()){
            this.fim++;
            this.elementos[this.fim] = elemento;
            qtd++;
            return true;
        }else{
            return false;
        }
    }
    
    T dequeue(){
        T elemento = this.elementos[this.inicio];
        this.inicio++;
        this.qtd--;
        return elemento;
    }
    
    boolean isEmpty(){
        return qtd==0;
    }
    
    T first(){
        return this.elementos[this.inicio];
    }
    
    T last(){
        return this.elementos[this.fim];
    }
    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            int i = inicio;
            while (i != fim) {
                System.out.println(elementos[i]);
                i++;
            }
        }
    }
    
    
    
}
