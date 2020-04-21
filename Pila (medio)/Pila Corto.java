package pilas;//Paquete del proyecto
 
public class Stack {
    int TAM = 50;//Declaración de variable
    private int TOP;//Declaración de variable
    private int[] arrStack = new int[TAM];//Declaración de arreglo
    
    
    public Stack(){//Contructor
        TOP = 0;//Inicialización
    }
    
    public boolean isEmpty(){//Declaración función
        return(TOP==0);//Regresa el resultado
    }
    
    public boolean isFull() {//Declaración función
        return(TOP==TAM);//Regresa el resultado
    }
    public void push(int e){//Declaración función
        if(isFull()){
            System.out.print("Pila llena");]
        }
        arrStack[TOP]=e;
        TOP++;
    }

    public int pop(){//Declaración función
        int x; //Declaración variable
        
        if(isEmpty()){
            return -10000000;
        }
        TOP--;
        x = arrStack[TOP]; //Asignación de variable
        return x;//Regresa el resultado
    } 
   
    public int TOP(){//Declaración función
        int x;//Declaración variable
        
        if(isEmpty()){
            System.out.print("Pila vacia");
        }
        
        x = arrStack[TOP-1];//Asignación de variable
        return x;//Declaración variable
    }
 
    
    
}