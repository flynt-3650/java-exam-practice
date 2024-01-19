/*
 * Copyright (c) Eliza.
 */

package newticket6;


class IntTree {
    Node root;
    public IntTree(Node root) {
        this.root = root;
    }

    public boolean equals2(IntTree tree) {
        return equalsHelper(this.root, tree.root);
    }

    public boolean equalsHelper(Node oneNode, Node otherNode) {
        if (oneNode == null && otherNode == null) {
            return true;
        }

        if (oneNode == null || otherNode == null) {
            return false;
        }

        // compare the root
        boolean nodeEquals = oneNode.equals(otherNode);
        // compare subtrees
        boolean leftEquals = equalsHelper(oneNode.left, otherNode.left);
        boolean rightEquals = equalsHelper(oneNode.right, otherNode.right);
        return nodeEquals && leftEquals && rightEquals;
    }

    public static void main(String[] args) {
        Node node1 = new Node(12);
        node1.left = new Node(1);
        node1.right = new Node(2);

        IntTree tree1 = new IntTree(node1);

        Node node2 = new Node(12);
        node2.left = new Node(1);
        node2.right = new Node(2);

        IntTree tree2 = new IntTree(node2);

        System.out.println(tree1.equals2(tree2));
    }
}
