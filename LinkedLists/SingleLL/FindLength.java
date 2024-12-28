/******************************************************************************

// Find the length of Linked List


*******************************************************************************/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {
    static int findLength(Node head){
        Node temp = head;
        int countNode = 0;
        while(temp != null){
            countNode++;
            temp = temp.next;
        }
        return countNode;
    }
    
}


class FindLength
{
    public static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
	public static void main(String[] args) {
	    Node head = new Node(1);
	    head.next = new Node(2);
	    head.next.next = new Node(3);
	    head.next.next.next = new Node(5);
	    head.next.next.next.next = new Node(6);
	    head.next.next.next.next.next = null;
	   
	    
	    printLL(head);
	    
		Solution obj = new Solution();
		int res = obj.findLength(head);
		System.out.println("Length of the linked List: " + res);
	}
}
