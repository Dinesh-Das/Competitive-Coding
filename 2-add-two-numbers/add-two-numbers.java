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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        while(!s1.isEmpty()){
            a=a.multiply(new BigInteger("10")).add(new BigInteger(String.valueOf(s1.pop())));
        }
        while(!s2.isEmpty()){
           b=b.multiply(new BigInteger("10")).add(new BigInteger(String.valueOf(s2.pop())));
        }
        BigInteger sum= a.add(b);
        String ans=sum.toString();
        int i=ans.length()-1;
        ListNode added= new ListNode();
        ListNode result=added;
        while(i>=0){
            ListNode node=new ListNode(Integer.parseInt(""+ans.charAt(i)));
            added.next=node;
            added=added.next;
            i--;
        }
        return result.next; 
    }
}