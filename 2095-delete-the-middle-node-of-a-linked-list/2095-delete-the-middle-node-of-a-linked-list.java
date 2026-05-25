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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        ListNode temo = head;
        while(temo!=null){
            if(mid == 1 && temo.next!=null){
                temo.next = temo.next.next;
                break;
            }
            mid--;
            temo = temo.next;
        }
        return head;
    }
}