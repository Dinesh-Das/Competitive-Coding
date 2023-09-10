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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head=head.next;
        }
        ListNode result = new ListNode();
        head=result;
        int n=stack.size();
        for(int i=0;i<n;i++){
            result.next= new ListNode(stack.pop());
            result=result.next;
        }
        return head.next;
    }
}