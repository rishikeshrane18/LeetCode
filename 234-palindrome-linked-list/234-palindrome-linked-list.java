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
class Solution {
    public ListNode Middle(ListNode head){
        ListNode hare = head;
        ListNode tur = head;
        
        while(hare.next !=null && hare.next.next != null){
            hare = hare.next.next;
            tur = tur.next;
        }
        return tur;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = Middle(head);
        
        ListNode secondhalf = reverse(middle.next);
        ListNode firsthalf = head;
        
        while(secondhalf != null){
            
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true ;
    }
}