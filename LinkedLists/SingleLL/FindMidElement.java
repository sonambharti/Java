/******************************************************************************

// Find Middle Element of Linked List

You are given the head of a singly linked list A of length N. The values in the list are A1,A2,…,AN respectively.
You need to find the value of the middle element of the linked list.

The middle element of a linked list of length N is the (⌊N/2⌋ +1)-th element from the head of the list.

Input Format

The first line of each test case contains a single integer N. The second line of each test case 
contains N space-separated integers A1,A2,…,AN .

Output Format
For each test case, the function you complete should return the value of the middle element of the list.
Note: You need to complete the function getMiddleElement to solve the problem.

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
    
    static int getMiddleElement(Node head){
        int n = findLength(head);
        Node temp = head;
        int loop = n/2;
        while(loop > 0){
            loop--;
            temp = temp.next;
        }
        return temp.data;
    }

}


class FindMidElement
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
		int res = obj.getMiddleElement(head);
		System.out.println(res);
	}
}
