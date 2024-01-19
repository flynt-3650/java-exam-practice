/*
 * Copyright (c) Eliza.
 */

package newticket6;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Node otherNode = (Node) obj;
        return this.val == otherNode.val;
    }
}
