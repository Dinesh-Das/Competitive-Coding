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
    public ListNode mergeNodes(ListNode head) {
        ListNode cur=head;
        ListNode res=null;
        ListNode start=null;
        int sum=0,zcnt=0;
        while(cur!=null){
            sum+=cur.val;
            if(cur.val==0) zcnt++;
            if(zcnt==2){
                if(res==null){
                    res=new ListNode(sum);
                    start=res;
                }else{
                    ListNode node =new ListNode(sum);
                    res.next=node;
                    res=node;
                }
                sum=0;
                zcnt=1;
            }
            cur=cur.next;
        }
        return start;
    }
}