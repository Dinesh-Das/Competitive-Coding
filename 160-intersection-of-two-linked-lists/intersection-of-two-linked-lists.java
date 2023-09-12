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
        Map<ListNode,Boolean> map = new HashMap<>();
        ListNode tmp=headA;
        while(tmp!=null){
            map.put(tmp,true);
            tmp=tmp.next;
        }
        tmp=headB;
        while(tmp!=null){
            if(map.containsKey(tmp)){
                return tmp;
            }
            tmp=tmp.next;
        }
        return null;
    }
}