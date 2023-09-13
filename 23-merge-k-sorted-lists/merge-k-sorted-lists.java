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
        int size=lists.length;
        int interval=1;
        while(interval < size){
            for(int i=0;i<size-interval;i+=interval * 2){
                lists[i]=merge(lists[i],lists[i+interval]);
            }
            interval *= 2;
        }
        return size > 0 ? lists[0] : null;
    }

    public ListNode merge(ListNode first,ListNode second){
        ListNode dummy=new ListNode();
        ListNode cur=dummy;
        while(first!=null && second!=null){
            if(first.val < second.val){
                cur.next=first;
                first=first.next;
            }else{
                cur.next=second;
                second=second.next;
            }
            cur=cur.next;
        }
        cur.next=(first == null)? second : first;
        return dummy.next;
    }
}