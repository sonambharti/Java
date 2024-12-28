/******************************************************************************

// Critical points in a Linked List

Given the head of a linked list, Find the number of critical points. (The starting and end are not considered critical points).

Local minima or maxima are called critical points.

A Node is called a local minima if both next and previous elements are greater than the current element.

A Node is called a local maxima if both next and previous elements are smaller than the current element.

*******************************************************************************/

import java.util.*;

class Node
{
    int val;
    Node next;
    Node(int d) {val = d; next = null; }
}


class Solution {
    public static int countCriticalPoints(Node root){
        Node prev = root;
        Node curr = root.next;
        Node nnext = root.next.next;
        int count = 0;
        
        while (nnext != null) {
            if ((prev.val < curr.val) && (curr.val > nnext.val)){
                count++;
            }
            if ((prev.val > curr.val) && (curr.val < nnext.val)){
                count++;
            }
            prev = prev.next;
            curr = curr.next;
            nnext = nnext.next;
        }
        return count;
    }
}


class CountCriticalPoint
{
    public static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
	public static void main(String[] args) {
	    Node head = new Node(2);
	    head.next = new Node(3);
	    head.next.next = new Node(1);
	    head.next.next.next = new Node(5);
	    head.next.next.next.next = null;
	   
	    
	    printLL(head);
	    
		Solution obj = new Solution();
		int res = obj.countCriticalPoints(head);
		System.out.println("No. of critical points = " + res);
	}
}
