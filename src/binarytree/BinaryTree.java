package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void printLevelOrderTraversal() {
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            final Node currentNode = queue.poll();

            System.out.println(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public boolean bfs(final Integer value) {
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            final Node currentNode = queue.poll();

            if (currentNode.value == value) {
                return true;
            }

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return false;
    }
}
