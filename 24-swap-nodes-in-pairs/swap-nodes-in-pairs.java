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
        ListNode cur=head;
        ListNode res=new ListNode();
        ListNode ans=res;
        if(cur==null || cur.next==null )return head;
        while(cur!=null && cur.next!=null){
            res.next=new ListNode(cur.next.val);
            res=res.next;
            res.next=new ListNode(cur.val);
            res=res.next;
            cur=cur.next.next;
        }
        if(cur!=null){
            res.next=new ListNode(cur.val);
            res=res.next;
        }
        return ans.next;
    }
}