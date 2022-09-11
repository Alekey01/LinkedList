public class Main {

    public static void main(String[] args){
        List lista = new List();

        lista.addAtTail("Luis");
        lista.addAtTail("Pedro");
        lista.addAtFront("Alex");
        lista.addAtFront("Sergio");

        ListIterator Iterator = lista.GetIterator();
        ListIterator i = lista.GetIterator();

        while(Iterator.HasNext()){
            System.out.println(Iterator.Next());
        }
        System.out.println("");
        System.out.println(lista.GetSize());

        lista.Remove(3);
        System.out.println(lista.GetAt(2));
        System.out.println("");
        while(i.HasNext()){
            System.out.println(i.Next());
        }
    }
}
