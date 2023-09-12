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
    public ListNode swapPairs(ListNode head) {
        ListNode res=new ListNode();
        res.next=head;
        ListNode prev=res;
        ListNode ans=res;
        while(head!=null && head.next!=null){
            ListNode first=head;
            ListNode second=head.next;

            prev.next =second;
            first.next=second.next;
            second.next=first;

            prev=first;
            head=first.next;
            
        }
        return res.next;
    }
}