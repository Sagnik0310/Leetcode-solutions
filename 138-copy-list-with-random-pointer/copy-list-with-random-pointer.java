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
        if(head == null) return null;
        Node curr = head;
        HashMap<Node,Node> map = new HashMap<>();
        while(curr != null){
            Node copy = new Node(curr.val);
            map.put(curr,copy);
            curr = curr.next;
        }
        Node pointer = head;
        while(pointer != null){
            map.get(pointer).next = map.get(pointer.next);
            map.get(pointer).random = map.get(pointer.random);
            pointer = pointer.next;
        }
        return map.get(head);
    }
}