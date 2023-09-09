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
    public ListNode removeElements(ListNode head, int val) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode prev=start,cur=head;
        while(cur!=null){
            if(cur.val!=val){
                prev=cur;
            }else{
                prev.next=cur.next;
            }
            cur=cur.next;
        }
        return start.next;
    }
}