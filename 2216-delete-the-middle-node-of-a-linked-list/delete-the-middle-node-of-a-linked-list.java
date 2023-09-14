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
    public ListNode deleteMiddle(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        list.remove(n/2);
        ListNode cur=new ListNode(0);
        head=cur;
        for(int val:list){
            cur.next=new ListNode(val);
            cur=cur.next;
        }
        return head.next;
        
    }
}