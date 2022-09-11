public class List{

    private Node head, tail;
    private int size;

    public List(){
        head = tail = null;
        size = 0;
    }

    public ListIterator GetIterator(){
        return new ListIterator(head);
    }

    public int GetSize(){
        return size;
    }

    public void RemoveAllWithValue(String info){

        Node node = head;
        while(node != null){
            if(node.getDataNode() == info){

                size--;
                Node aux1, aux2;
                aux1 = node.previous;
                aux2= node.next;
                if(aux1 != null){
                    aux1.next = aux2;
                }
                else{
                    head = aux2;
                }
                if(aux2 != null){
                    aux2.previous = aux1;
                }
                else{
                    tail = aux1;
                }
            }
            node = node.next;
        }
    }


    public String GetAt(int index){
        Node node = head;
        int count = 0;

        while(node != null && count != index){
            node = node.next;
            count++;
        }

        if (node != null){
            return node.getDataNode();

        }
        return null;
    }

    public void  SetAt(int index, String info){
        Node node = head;
        int count = 0;
        while(count != index && node != null){
            node = node.next;
            count++;
        }
        if( node != null){
            node.setData(info);
        }
    }

    public void RemoveAll(){

        while(head != null){
            head=head.next;
        }
        size = 0;
    }

    public void Remove(int index){
        int count = 0;
        if (head != null){
            Node aux1 = head, aux2 = null;

            while(aux1 != null && count != index){

                aux2 = aux1;
                aux1 = aux1.next;
                count++;
            }

            if(aux1 == null) {
                System.out.println("No existe");
            }

            else if(aux2 == null){
                head = aux1.next;
                size--;
            }
            else{
                aux2.next = aux1.next;
                size--;
            }
        }

    }

    public void addAtFront(String info){
        Node node = new Node(info);
        if(head==null)
            head = node;
        else
            node.next = head;
            head = node;

        head = node;
        size++;
    }

    public void addAtTail(String info){
        Node node = new Node(info);

        if (tail==null) {
            head = node;
        }
        else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        tail = node;
        size++;
    }


}