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
    HashMap<Node,Node> visitednode=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        if(this.visitednode.containsKey(head)){
            return this.visitednode.get(head);
        }
        Node node = new Node(head.val,null,null);
        this.visitednode.put(head,node);
        node.next = copyRandomList(head.next);
        node.random=copyRandomList(head.random);
        return node;

    }
}