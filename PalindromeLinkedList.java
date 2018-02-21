/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        ListNode headCopy = head;
        ListNode reverse = new ListNode(head.val);

        while(true){
            headCopy = headCopy.next;
            if (headCopy == null){break;}
            reverse = add(reverse, headCopy.val);
        }

        while(head != null){
            if (head.val != reverse.val){
                return false;
            } else {
                head = head.next;
                reverse = reverse.next;
            }
        }
        return true;
    }

    public ListNode add(ListNode head, int value){
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        return newHead;
    }
}
