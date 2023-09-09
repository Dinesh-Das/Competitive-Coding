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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            if(stack.isEmpty()){
                stack.push(head.val);
                head=head.next;
            }else if(stack.peek() < head.val){
                stack.pop();
            }else{
                stack.push(head.val);
                head=head.next;
            }
        }
        ListNode res= new ListNode();
        ListNode tmp=res;
        for(int val:stack){
            ListNode node=new ListNode(val);
            res.next=node;
            res=res.next;
        }
        return tmp.next;
    }
}