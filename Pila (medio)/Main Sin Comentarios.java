package pilas;


public class Pilas {

    public static void main(String[] args) {
        Stack p = new Stack();
        
        System.out.print("\nLa pila esta vacia? "+p.isEmpty());
        System.out.print("\nLa pila esta llena? "+p.isFull());
        
        p.push(1);
        p.push(2);
        p.push(3);
        
        System.out.print("\nDato extraido de la pila: "+p.pop());
        System.out.print("\nDato extraido de la pila: "+p.pop());
        System.out.print("\nUltimo dato en la pila: "+p.TOP());
        
        
       
    }
    
}