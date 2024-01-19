/*
 * Copyright (c) Eliza.
 */

package newTicket6;
class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public boolean equals(Node node) {
        if (node == null) {
            return false;
        }
        return this.val == node.val;
    }
}
