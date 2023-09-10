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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list =new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        ListNode node=new ListNode();
        head=node;
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(i==list.size()-n){
                continue;
            }else{  
                node.next=new ListNode(list.get(i));
                node=node.next;
            }
        }
        return head.next;
    }
}