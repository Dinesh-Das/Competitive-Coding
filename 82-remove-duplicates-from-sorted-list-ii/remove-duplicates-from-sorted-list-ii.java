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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        while(head!=null){
            if(!map.containsKey(head.val)){
                map.put(head.val,1);
            }else{
                map.put(head.val,2);
            }
            head=head.next;
        }
        ListNode node=new ListNode();
        head=node;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=2){
                node.next=new ListNode(entry.getKey());
                node=node.next;
            }
        }
        return head.next;
    }
}