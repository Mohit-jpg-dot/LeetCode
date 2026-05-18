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
    public ListNode removeElements(ListNode head, int Val) {
       ListNode newHead = new ListNode(0); 
       ListNode curr = newHead;
       ListNode temp = head;
       while(temp!=null){
        if(temp.val!=Val){
            ListNode newNode = new ListNode(temp.val);
            curr.next = newNode;
            curr = curr.next;
        }
        temp = temp.next;
       }
       return newHead.next;
    }
}