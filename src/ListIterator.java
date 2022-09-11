public class ListIterator {
    Node node;

    public ListIterator(Node node){
        this.node = node;
    }

    public boolean HasNext(){
        return node != null;
    }

    public String Next(){
        String info = node.getDataNode();
        node = node.next;
        return info;
    }
}
