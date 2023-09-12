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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1=reverse(l1);
        ListNode r2=reverse(l2);
        int sum=0;
        ListNode tmp=new ListNode();
        ListNode ans=tmp;
        while(r1!=null || r2!=null){
            if(r1!=null){
                sum+=r1.val;
                r1=r1.next;
            }
            if(r2!=null){
                sum+=r2.val;
                r2=r2.next;
            }
            tmp.next=new ListNode(sum%10);
            tmp=tmp.next;
            sum/=10;
        }
        if(sum!=0) tmp.next=new ListNode(sum);
        ans=reverse(ans.next);
        return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode tmp=head.next;
            head.next=prev;
            prev=head;
            head=tmp;
        }
        return prev;
    }
}