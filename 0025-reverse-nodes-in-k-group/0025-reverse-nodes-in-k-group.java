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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = null, tail = null, temp = head; 

        while(temp!=null){
            ListNode lastTail = temp, prev = null; 

            for(int i = 0; i < k; i++){
                if(temp==null){
                    prev = rev(prev);
                    break; 
                }
                ListNode next1 = temp.next; 
                temp.next = prev; 
                prev = temp; 
                temp = next1; 
            }

            if(newHead==null){
                newHead = prev; 
                tail = lastTail; 
            }
            else{
                tail.next = prev; 
                tail = lastTail; 
            }
        }

        return newHead; 
    }

    public ListNode rev(ListNode head){
        ListNode temp = head, prev = null;
        while(temp!=null){
            ListNode next1 = temp.next; 
            temp.next = prev; 
            prev = temp; 
            temp = next1; 
        }

        return prev; 
    }
}