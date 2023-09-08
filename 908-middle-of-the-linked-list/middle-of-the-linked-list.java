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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode result=null;
        int n=0,i=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(i == n/2){
                result=temp;
                break;
            }
            i++;
            temp=temp.next;
        }
        return result;
    }
}