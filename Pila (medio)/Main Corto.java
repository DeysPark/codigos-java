package pilas;//Paquete del proyecto


public class Pilas {

    public static void main(String[] args) {
        Stack p = new Stack();//Se declara el objeto
        
        //Se muestra el resultado
        System.out.print("\nLa pila esta vacia? "+p.isEmpty());
        //Se muestra el resultado
        System.out.print("\nLa pila esta llena? "+p.isFull());
        
       //Se llama al metodo del objeto
        p.push(1);
        p.push(2);
        p.push(3);
        
        //Se muestran los datos
        System.out.print("\nDato extraido de la pila: "+p.pop());
        System.out.print("\nDato extraido de la pila: "+p.pop());
        
        //Se muestran el tope
        System.out.print("\nUltimo dato en la pila: "+p.TOP());
        
        
       
    }
    
}