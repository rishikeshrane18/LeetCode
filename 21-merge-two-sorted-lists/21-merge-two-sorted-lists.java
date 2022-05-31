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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        // to keep track of new linkedlist
        ListNode head = new ListNode(0);
        // it is like dumy node which will go through list1 & list2
        ListNode last = head;
        
        while(list1 != null && list2 != null){
            
            if(list1.val < list2.val){
                last.next = list1;
                list1 = list1.next;
            }else{
                last.next = list2;
                list2 = list2.next;
            }
            last = last.next;
            
        }
        if(list1 == null){
            last.next = list2;
        }
        if(list2 == null){
            last.next = list1;
        }
        
        return head.next;
        
    }
}

