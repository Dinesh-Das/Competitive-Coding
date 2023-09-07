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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur=head;
        while(cur!=null){
            if(cur.next !=null){
                int a=cur.val;
                int b=cur.next.val;
                ListNode node=new ListNode(gcd(a,b));
                node.next=cur.next;
                cur.next=node;
                cur=cur.next;
            }
            cur=cur.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}