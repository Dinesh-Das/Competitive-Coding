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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        List<Integer> list=new ArrayList<>();
        int res=0;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<list.size();i++){
            res+= (list.get(i) * Math.pow(2,list.size()-1-i));
        }
        return res;
    }
}