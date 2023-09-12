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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode();
        ListNode result=dummy;
        ListNode greater=new ListNode();
        ListNode result2=greater;
        while(head!=null){
            if(head.val <x){
                dummy.next= new ListNode(head.val);
                dummy=dummy.next;
            }else{
                greater.next=new ListNode(head.val);
                greater=greater.next;
            }
            head=head.next;
        }
        dummy.next=result2.next;
        return result.next;
    }
}