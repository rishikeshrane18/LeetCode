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
    
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newhead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return newhead;
        
    }
    
    public int[] nextLargerNodes(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        ListNode temp = reverseList(head);
        
        // if(head == null || head.next == null){
        //     return null;
        // }
        //  if(temp == null || temp.next == null){
        //     return null;
        // }
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<>();
        
        while(temp!=null){
            
            if(s.empty()){
                l.add(0);
            }
            
                
            else if(s.size() > 0 && s.peek()>temp.val){
                    l.add(s.peek());
            }
                
            else if(s.size() > 0 && s.peek() <= temp.val){
                while(s.size() > 0 && s.peek() <= temp.val){
                    s.pop();
                }
                if(s.empty()){
                    l.add(0);
                }
                else{
                    l.add(s.peek());
                }
            }
           
            s.push(temp.val);
             temp = temp.next;
        }
        
        int n = l.size();
        Collections.reverse(l);
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = l.get(i);
        }
        
        return arr;
    }
}