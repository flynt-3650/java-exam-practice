/*
 * Copyright (c) Eliza.
 */

package newticket6;

class Node {
    private int val;
    private Node left;
    private Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Node otherNode = (Node) obj;

        return val == otherNode.val;
    }

    @Override
    public int hashCode() {
        return val;
    }
}
