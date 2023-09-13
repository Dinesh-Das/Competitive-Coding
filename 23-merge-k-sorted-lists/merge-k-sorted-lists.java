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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode cur=new ListNode(0);
        List<Integer> arr= new ArrayList<>();
        for(ListNode head:lists){
            while(head!=null){
                arr.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(arr);
        ListNode result=cur;
        for(int val:arr){
            cur.next=new ListNode(val);
            cur=cur.next;
        }
        return result.next;
    }
}