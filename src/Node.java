public class Node {

    Node next, previous;
    private String data;

    public Node(String data) {
        next = null;
        previous = null;
        this.data = data;
    }

    public String getDataNode() {
        return data;
    }

    public void setData(String data){
        this.data=data;
    }
}
