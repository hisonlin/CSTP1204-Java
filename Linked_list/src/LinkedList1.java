public class LinkedList1 {
    //This is the starting point of Linked List
    private Node head;
    public LinkedList1(){

    }

    public void addNode(int data){
        Node newNode = new Node(data); //Creating a Node

        //if empty = head, else = tail
        if(head == null){
            head = newNode;
        }else{
            Node current = head;//current equal head at he begining
            while(current.next != null){// if here have a value for the next
                current = current.next;//reassign the value of current to next, untill current being the last of the Linked list
            }
            current.next = newNode;

        }

    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.getData());
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}


