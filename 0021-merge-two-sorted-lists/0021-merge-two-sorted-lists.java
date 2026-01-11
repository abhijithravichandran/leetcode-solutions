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
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = list1; 
        while(temp != null){
            list.add(temp.val);
            temp = temp.next; 
        }
        ListNode temp2 = list2; 
        while(temp2 != null){
            list.add(temp2.val);
            temp2 = temp2.next; 
        }
        Collections.sort(list);
        ListNode res = new ListNode();
        ListNode head = res;     

        for(int each: list){
            ListNode newNode = new ListNode();
            newNode.val = each; 
            res.next = newNode; 
            res = res.next; 
        }
        return head.next; 
    }
}