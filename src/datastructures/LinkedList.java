package datastructures;

public class LinkedList {
   private Node head;
   private Node tail;
   private int length;
    public class Node {
        //This class is to create a node that contains value & pointer
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head:"+" "+head.value);
    }
    public void getTail(){
        System.out.println("Tail:"+" "+tail.value);
    }
    public void getLength(){
        System.out.println("Length:"+" "+length);
    }
    public void append(int value){
        //create a node
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
        }
        else {
            //move tail pointer to new node
            tail.next = newNode;
            //move tail node to new node
            tail = newNode;
        }
        length++;

    }
}
