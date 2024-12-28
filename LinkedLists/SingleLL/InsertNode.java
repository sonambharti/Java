/***************
// Insert Node at the begining of Linked List
****************/

class Node {
    public int value;
    public Node next;
    
    // Constructor to initialize the node with a given value
    public Node(int val) {
        value = val;
        next = null;
    }
}

class LinkedList {
    
    public Node insertFront(int value, Node head) {
        System.out.println("Inserting " + value);
        
        // Step 1: Create a new Node
        Node newNode = new Node(value);
        
        // Step 2: Set next of newNode to the current head
        newNode.next = head;
        
        // Step 3: Set newNode as the head
        head = newNode;
        
        return head;
    }
    
    public int getHeadValue(Node head) {
        if (head == null) {
            return -1;
        } else {
            return head.value;
        }
    }
}

public class InsertNode {
    
    public static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
  	    head.next = new Node(2);
  	    head.next.next = new Node(3);
  	    head.next.next.next = new Node(5);
  	    // head.next.next.next.next = new Node(6);
  	    head.next.next.next.next.next = null;
  	   
  	    printLL(head);
	    
        LinkedList list = new LinkedList();
        Node res1 = list.insertFront(9, head);
        printLL(res1);
        System.out.println("The value at the head is: " + list.getHeadValue(res1));
        
        Node res2 = list.insertFront(8, res1);
        printLL(res2);
        System.out.println("The value at the head is: " + list.getHeadValue(res2));
        
    }
}
