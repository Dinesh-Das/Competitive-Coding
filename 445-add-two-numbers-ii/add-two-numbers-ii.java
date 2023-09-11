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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        while(l1!=null){
            a.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            b.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode cur=new ListNode();
        ListNode res=cur;
        Stack<Integer> ans= new Stack<>();
        while(!a.isEmpty() || !b.isEmpty()){
            int x= (a.isEmpty())?0:a.pop();
            int y= (b.isEmpty())?0:b.pop();
            int sum=x+y+carry;
            if(sum<10){
                ans.push(sum);
                carry=0;
            }else{
                ans.push(sum%10);
                carry=1;
            }
        }
        if(carry==1){
            ans.push(carry);
        }
        while(!ans.isEmpty()){
            cur.next=new ListNode(ans.pop());
            cur=cur.next;
        }
        return res.next;
        
    }
}