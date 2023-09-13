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
    public ListNode sortList(ListNode head) {
        ListNode cur=head;
        List<Integer> list = new ArrayList<>();
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(list);
        cur=new ListNode();
        ListNode result=cur;
        for(int val:list){
            cur.next=new ListNode(val);
            cur=cur.next;
        }
        return result.next; 
    }
}