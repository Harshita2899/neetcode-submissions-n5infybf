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
        if (head==null)
        {
            return null;
        }

        Node cur = head;
        Node new_head = null;
        Node new_cur = null;
        HashMap<Node,Node> hm = new HashMap();
        
        while(cur!=null)
        {
            Node temp = new Node(cur.val);
            if(new_head==null)
            {
                new_head =temp;
                new_cur = new_head;
                hm.put(head,new_head);

            }
            else
            {
                new_cur.next = temp;
                new_cur = new_cur.next;
                hm.put(cur,new_cur);
                
            }
            cur = cur.next;
        }
        cur =head;
        new_cur = new_head;
        
        while(cur!= null)
        {
            Node temp = cur.random;
            if(temp!=null)
            {
                Node chk = hm.get(temp);
                new_cur.random = chk;
            }
            cur=cur.next;
            new_cur = new_cur.next;

        }
        return new_head;
    }
}
