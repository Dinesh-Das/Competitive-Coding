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
    public int pairSum(ListNode head) {
        int maxSum=Integer.MIN_VALUE,n=0;
        ListNode temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        n=list.size();
        for(int i=0;i<=(n/2)-1;i++){
            maxSum=Math.max(maxSum,(list.get(i)+list.get(n-1-i)));
        }
        return maxSum;
    }
}