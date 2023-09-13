class MyLinkedList {
    private Node head;
    private int size;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public MyLinkedList() {
        size=0;
        this.head=new Node(0);
    }
    
    public int get(int index) {
        if(index < 0 || index>=size) return -1;
        Node cur=head;
        while(index>=0){
            cur=cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        Node cur=head;
        Node node=new Node(val);
        for(int i=0;i<index;i++) cur=cur.next;
        node.next=cur.next;
        cur.next=node;
        size++;       
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || index >=size)return;
        Node cur=head;
        while(index > 0){
            cur=cur.next;
            index--;
        }
        cur.next=cur.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */