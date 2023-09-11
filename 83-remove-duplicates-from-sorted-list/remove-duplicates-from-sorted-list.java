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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        ListNode ans;

        int val=(cur!=null)?cur.val:0;
        prev=cur;
        ans=prev;
        cur=(cur!=null)?cur.next:null;
        
        while(cur!=null){
            if(val!=cur.val){
                prev.next=cur;
                prev=prev.next;
                val=cur.val;
            }
            cur=cur.next;
        }
        if(prev!=null) prev.next=null;
        return ans;
    }
}