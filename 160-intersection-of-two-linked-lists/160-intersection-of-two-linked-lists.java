/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode temp = headA;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = headB;
        
        ListNode fast = headA;
        ListNode slow = headA;
        ListNode start = null;       
        while(fast != null && fast.next != null){
            
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){ // LOOP DETECTED
                
                
                start = headA;
                while(slow != start){
                    slow = slow.next;
                    start = start.next;
                }
                break;
            }
            
             // unjoin the cycle
        }
        temp.next = null;
        return start;
    }
}