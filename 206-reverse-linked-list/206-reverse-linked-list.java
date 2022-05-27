/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

        ///// ITERATIVE APPROACH TO REVERSE

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
                return head;
            }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        
        while(currNode != null){
            
            ListNode nextNode = currNode.next;
            
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        
        return head;
    }
   
 }










// RECURSIVE APPROACH

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newhead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return newhead;
        
    }
}
