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
        int  size=0;
        ListNode cur=head;
        ListNode tmp=new ListNode();
        tmp.next=head;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        size-=n;
        cur=tmp;
        while(size>0){
            size--;
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return tmp.next;   
    }
}