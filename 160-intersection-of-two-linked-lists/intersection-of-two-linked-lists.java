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
        ListNode a=headA;
        ListNode b=headB;
        int n=1,m=1;
        while(a.next!=null){
            n++;
            a=a.next;
        }
        while(b.next!=null){
            m++;
            b=b.next;
        }
        if(a!=b){
            return null;
        }
        a=headA;
        b=headB;
        if(n>m){
            int skip=0;
            while(true){
                if(skip==(n-m)){
                    break;
                }
                skip++;
                a=a.next;
            }

        }else if(n<m){
            int skip=0;
            while(true){
                if(skip==(m-n)){
                    break;
                }
                skip++;
                b=b.next;
            }
        }
        while(a!=null){
            if(a==b){
                return a;
            }
            a=a.next;
            b=b.next;
        }
        return null;
    }
}