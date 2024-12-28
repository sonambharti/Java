/******************************************************************************

// Cycle in a linked list

You are given a linked list A of size N.

Return the node where the cycle begins in the linked list. If there is no cycle, return NULL.

Input:

First line contains an integer , length of the linked list .
Second line contains A1,A2,A3,....... , the value of the linked list nodes starting from the head for the linked list.
Third line contains an integer denoting the index of the node where the cycle starts.
*******************************************************************************/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


class Solution {
    public static Node detectCycle(Node head){
        // Add code here
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                isCycle = true;
                break;
            }
        }
        if (!isCycle) return null;
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}


class FindCycleNode
{
    public static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
	public static void main(String[] args) {
	    Node head = new Node(2);
	    head.next = new Node(3);
	    head.next.next = new Node(4);
	    head.next.next.next = new Node(5);
	   // head.next.next.next.next = null;
	    head.next.next.next.next = head.next;
	    
	   // printLL(head);
	    
		Solution obj = new Solution();
		Node res = obj.detectCycle(head);
		System.out.println(res.data);
	}
}
