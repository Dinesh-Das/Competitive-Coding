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
    public ListNode swapNodes(ListNode head, int k) {
       List<Integer> list=new ArrayList<>();
       while(head!=null){
           list.add(head.val);
           head=head.next;
       } 
       ListNode node=new ListNode(0);
       head=node;
       int n=list.size()-k;
       for(int i=0;i<list.size();i++){
           if(i== k-1){
               ListNode no=new ListNode(list.get(n));
               node.next=no;
               node=node.next;
           }else if (i==n){
               ListNode no=new ListNode(list.get(k-1));
               node.next=no;
               node=node.next;
           }else{
               ListNode no=new ListNode(list.get(i));
               node.next=no;
               node=node.next;
           }

       }
       return head.next;
    }
}