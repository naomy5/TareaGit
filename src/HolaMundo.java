class Nodo{
    int dato;
    Nodo siguiente;

    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
}

public class HolaMundo {

    public static void main(String[] args) {
        Nodo primero = new Nodo(10);
        Nodo segundo = new Nodo(20);
        Nodo tercero = new Nodo(30);

        primero.siguiente= segundo;
        segundo.siguiente=tercero;

        Nodo actual = primero;

        System.out.println("Lista simple");

        while(actual !=null){
            System.out.println(actual.dato);
            actual=actual.siguiente;
        }

    }
}
