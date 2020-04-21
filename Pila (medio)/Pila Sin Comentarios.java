package pilas;

 
public class Stack {
    int TAM = 50;
    private int TOP;
    private int[] arrStack = new int[TAM];
    
    
    public Stack(){
        TOP = 0;
    }
    
    public boolean isEmpty(){
        return(TOP==0);
    }
    
    public boolean isFull() {
        return(TOP==TAM);
    }
    public void push(int e){
        if(isFull()){
            System.out.print("Pila llena");
        }
        arrStack[TOP]=e;
        TOP++;
    }

    public int pop(){
        int x;
        
        if(isEmpty()){
            return -10000000;
        }
        TOP--;
        x = arrStack[TOP];
        return x;
    } 
   
    public int TOP(){
        int x;
        
        if(isEmpty()){
            System.out.print("Pila vacia");
        }
        
        x = arrStack[TOP-1];
        return x;
    }
 
    
    
}