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
    public boolean isPalindrome(ListNode head) {
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
        while(reversed!=null){
            if(lol.val != reversed.val) return false;
            lol = lol.next;
            reversed = reversed.next;
        }
        return true;
    }
}