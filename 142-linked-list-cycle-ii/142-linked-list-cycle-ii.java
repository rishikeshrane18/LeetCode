/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){// LOOP IS DETECTED 
                ListNode meet = slow;
                while(head!=meet){
                    head = head.next;
                    meet = meet.next;
                }
                return head; // where loops is started and ended .
            }
            
        }
       
       
       return null;
    }
}