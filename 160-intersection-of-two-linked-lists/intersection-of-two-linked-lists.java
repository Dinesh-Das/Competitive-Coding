/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA=headA;
        ListNode tmpB=headB;
        while(tmpA!=null){
            while(tmpB!=null){
                if(tmpA == tmpB){
                    return tmpA;
                }
                tmpB=tmpB.next;
            }
            tmpB=headB;
            tmpA=tmpA.next;
        }
        return null;
        
    }
}