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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ind = new ListNode(-1); 

        ListNode temp = head; 

        ListNode newHead = ind; 

        while(temp!=null){
            if(temp.val!=val){
                ind.next = temp; 
                ind = ind.next; 
                // ind.next = null; 
            }
            temp = temp.next; 
        }
        ind.next = null; 

        return newHead.next; 
    }
}