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
    public ListNode oddEvenList(ListNode head) {
        ListNode a=new ListNode(),b=new ListNode();;
        ListNode odd=a;
        ListNode even=b;
        int index=1;
        while(head!=null){
           if(index%2==0){
               b.next=head;
               b=b.next;
           }else{
               a.next=head;
               a=a.next;
           }
           index++;
           head=head.next; 
        }
        a.next=even.next;
        b.next=null;
        return odd.next;
    }
}