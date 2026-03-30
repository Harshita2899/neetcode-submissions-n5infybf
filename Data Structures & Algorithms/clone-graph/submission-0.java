/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node clonee(Node n,HashMap<Node,Node> hm)
    {
        if(hm.containsKey(n))
        {
            return hm.get(n);
        }
        Node c = new Node(n.val);
        hm.put(n,c);
        for(int i =0;i<n.neighbors.size();i++)
        {
            c.neighbors.add(clonee(n.neighbors.get(i),hm));
        }
        return c;
    }
    public Node cloneGraph(Node node) {
        if (node == null)
        {
            return null;
        }
        HashMap<Node,Node> hm = new HashMap();
        return clonee(node,hm);
    }
}