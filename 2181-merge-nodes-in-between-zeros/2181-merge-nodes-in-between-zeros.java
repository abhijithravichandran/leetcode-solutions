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
    public ListNode mergeNodes(ListNode head) {
        

        if(head.next==null) return head; 
        ListNode temp = head.next; 
        ListNode point = head; 
        int sum = 0; 
        ListNode prev = null; 
        while(temp!=null){
            if(temp.val==0){
                point.val = sum; 
                sum = 0; 
                prev = point; 
                point = point.next; 
            }
            sum += temp.val; 
            temp = temp.next; 
        }
        prev.next = null; 
        return head; 
    }
}