package practicum1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void addRecursive(int data) {
        root = addRecursiveNode(root, data);
    }

    private Node addRecursiveNode(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursiveNode(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursiveNode(current.right, data);
        }
        return current;
    }

    public int findSmallestValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
        }

        Node current = root;
        while(current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findLargestValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
        }
        Node current = root;
        while(current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void displayLeafNode() {
        displayLeafNode(root);
    }

    public void displayLeafNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        displayLeafNode(node.left);
        displayLeafNode(node.right);
    }

    public int countLeave() {
        return countLeave(root);
    }

    public int countLeave(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftCount = countLeave(node.left);
        int rightCount = countLeave(node.right);
        return leftCount + rightCount;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while(true) {
                if(data<current.data) {
                    if(current.left!=null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else { // data already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node current = root;
        while(current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParrent = del;
        while(successor.left != null) {
            successorParrent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParrent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if ( data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // uf there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there are 2 child
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

}
