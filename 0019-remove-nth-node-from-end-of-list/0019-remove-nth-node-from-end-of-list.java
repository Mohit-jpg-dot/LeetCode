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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        al.remove(al.size() - n);
        ListNode tempo = new ListNode(0);
        ListNode curr = tempo;
        for (int val : al) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return tempo.next;
    }
}