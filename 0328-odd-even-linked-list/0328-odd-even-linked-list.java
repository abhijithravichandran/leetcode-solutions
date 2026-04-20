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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = null; 
        ListNode even = null; 
        int ind = 0; 
        ListNode temp = head; 
        ListNode newHead = null; 
        ListNode evenHead = null; 

        if(head==null) return head; 

        while(temp!=null){
            ind++; 
            int data = temp.val; 
            if(ind%2==0){
                if(even==null){
                    even = new ListNode(data); 
                    evenHead = even; 
                }
                else{
                    even.next =new  ListNode(data); 
                    even = even.next; 
                }
                
            }
            else{
                if(odd==null){
                    odd =new ListNode(data) ; 
                    newHead = odd; 
                }
                else{
                    ListNode newNode = new ListNode(data); 
                    odd.next = newNode; 
                    odd = odd.next; 
                }
            }
            temp = temp.next; 
            
        }

        odd.next = evenHead; 
        return newHead; 
    }
}