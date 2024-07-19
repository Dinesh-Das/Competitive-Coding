/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node cur=head;
        while(cur!=null){
            Node copy= new Node(cur.val);
            copy.next=cur.next;
            cur.next=copy;
            cur=copy.next;
        }
        cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.random== null){
                cur.next.random=null;
            }else{
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        cur=head;
        Node res= new Node(0);
        Node ptr=cur.next;
        res.next=ptr;
        while(ptr!=null){
            cur.next=cur.next.next;
            cur=cur.next;
            if(ptr.next!=null)
                ptr.next=ptr.next.next;
            ptr=ptr.next;
        }
        return res.next;
    }
}