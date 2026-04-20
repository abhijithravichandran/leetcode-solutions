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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0; 
        ListNode temp = head, pointer1 = null, pointer2 = null; 
        int val  = 0;
        while(temp!=null){
            len++; 
            
            if(len==k){
                val = temp.val;
                pointer1 = temp; 
            }
            temp = temp.next; 
        }

        int n = len-k;
        temp = head; 
        for(int i = 1; i <= n;i++){
            temp = temp.next; 
        }

        int temp1 = pointer1.val; 
        pointer1.val = temp.val; 
        temp.val = temp1; 

        return head; 
    }
}