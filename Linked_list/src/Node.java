public class Node {
    private int data;// This refers to the data in node
    public Node next;// This refers to he next node in the list


    public Node(int incomingData) {
        this.data = incomingData;
        this.next = null;//By default
    }


    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    
}
