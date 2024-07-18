/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode tmp=head;
        do{
            if(fast==null || fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
        }while(fast!=slow);
        
        while(tmp!=slow){
            tmp=tmp.next;
            slow=slow.next;
        }
        return tmp;

    }
}