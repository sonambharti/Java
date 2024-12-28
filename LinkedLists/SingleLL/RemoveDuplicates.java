/******************************************************************************

// Remove Duplicates from Sorted List

You are given head of the non-empty sorted linked list where the value of the 
ith node will be Ai.

Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.

Input:
First line will contain T, number of test cases. Then the test cases follow.
The first line contains one integer N — the length of the linked list.
The second line contains N space separated integers A1,A2,… A N A1,A2,…AN

  — the value of the linked list nodes starting from the head for the linked list.
  
*******************************************************************************/

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


class Solution {
    public static Node removeDuplicates(Node head) {
        // your code here
        if (head == null || head.next == null){
            return head;
        }
        
        Node prev = head;
        Node curr = head.next;
        while(prev!=null){
            while(curr!=null && curr.data==prev.data){
                curr = curr.next;
            }
            prev.next = curr;
            prev = prev.next;
            if(prev!=null)
            curr = prev.next;
        }
        return head;
    }
}


class RemoveDuplicates
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
	    head.next.next.next.next = new Node(5);
	    head.next.next.next.next.next = null;
	   
	    
	    printLL(head);
	    
		Solution obj = new Solution();
		Node res = obj.removeDuplicates(head);
		
		printLL(head);
	}
}
