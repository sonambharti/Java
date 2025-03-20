/******************************************************************************

// Count Loop Length in a linked list

Given a linked list, there may exist a single loop or no loop. If there are a total of X elements present in a loop, 
return X-1 as your answer; otherwise, in case no loop exists, return -1.

To solve this problem, complete the function present in the submit solution tab.

Input Format
The first line will contain N, representing the elements in the linked list.
(For example, if N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5)

The second line contains M, representing the last node's connection point. If the second line contains -1, then the
last node will be connected to a null node; otherwise, it will be connected to one of the previous nodes.
(Example 1: If M equals -1 and N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5 -> NULL)

(Example 2: If M equals 2 and N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5 -> 2)

Constraints
Maximum elements in the linked list can be 10^5.
*******************************************************************************/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


class Solution {
    public static int findLoopLength(Node root){
        // Add code here
        if (root == null || root.next == null) {
            return -1;
        }
        
        Node slow = root;
        Node fast = root;
        boolean hasLoop = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        
        if (!hasLoop) {
            return -1;
        }
        
        int loopLength = 1;
        fast = fast.next;
        while (fast != slow) {
            fast = fast.next;
            loopLength++;
        }
        
        return loopLength;
    }
}


class CountLoopLength
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
	   // head.next.next.next.next = head.next; // 3
	   head.next.next.next.next = head; // 4
	    
	   // printLL(head);
	    
		Solution obj = new Solution();
		int res = obj.findLoopLength(head);
		System.out.println(res);
	}
}
