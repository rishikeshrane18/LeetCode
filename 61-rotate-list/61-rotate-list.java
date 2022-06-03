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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        
        // FINDING SIZE 
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        
        // FINDING REAR 
        ListNode rear =head;
        for(int i = 1; i < size;i++){
            rear = rear.next;
        }
        
        // ROTATING THE LINKEDLIST 
        int r = k%size;
        int nr = size-r-1;
        ListNode rot = head;
        for(int i=0;i<nr;i++){
            
            rot = rot.next;
            
        }
        rear.next = head;
        head = rot.next;
        rot.next = null;
        
        return head;
    }
}