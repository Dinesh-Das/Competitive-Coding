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
                ListNode node=new ListNode(gcd(cur.val,cur.next.val));
                node.next=cur.next;
                cur.next=node;
                cur=cur.next;
            }
            cur=cur.next;
        }
        return head;
    }
    public int gcd(int a,int b){
       while(a!=b){
           if(a>b){
               a=a-b;
           }else{
               b=b-a;
           }
       }
       return a;
    }
}