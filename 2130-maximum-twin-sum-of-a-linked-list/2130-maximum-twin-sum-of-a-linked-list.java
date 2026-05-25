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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        ListNode temo = head;
        while(temo!=null){
            if(mid == 0){
                break;
            }
            temo = temo.next;
            mid--;
        }
        ListNode reversed = reverse(temo);
        ListNode lol = head;
        int result = Integer.MIN_VALUE;
        while(reversed!=null){
            result = Math.max(result,lol.val + reversed.val);
            lol = lol.next;
            reversed = reversed.next;
        }
        return result;
    }
}