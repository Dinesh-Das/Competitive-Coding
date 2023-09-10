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
        ListNode cur=new ListNode();
        ListNode result=cur;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            int val=0;
            if(sum>=10){
                val=sum%10;
                carry=1;
            }else{
                val=sum;
                carry=0;
            }
            ListNode node=new ListNode(val);
            cur.next=node;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            int val=0;
            if(sum>=10){
                val=sum%10;
                carry=1;
            }else{
                val=sum;
                carry=0;
            }
            ListNode node=new ListNode(val);
            cur.next=node;
            cur=cur.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            int val=0;
            if(sum>=10){
                val=sum%10;
                carry=1;
            }else{
                val=sum;
                carry=0;
            }
            ListNode node=new ListNode(val);
            cur.next=node;
            cur=cur.next;
            l1=l1.next;
        }
        if(carry==1){
            ListNode node=new ListNode(carry);
            cur.next=node;
            cur=cur.next;
        }
        return result.next;
    }
}