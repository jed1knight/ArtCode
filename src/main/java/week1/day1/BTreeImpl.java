package week1.day1;

/**
 * Created by Home on 25.08.2015.
 */
public class BTreeImpl<E extends Comparable<E>> implements IBTree<E> {
    private Node<E> root;
    private int size;

    @Override
    public boolean add(E elem) {
        Node<E> start = root;
        if (root == null) {
            root = new Node<E>(elem, null);
            size++;
        }
        while (start != null) {
            if (start.elem.compareTo(elem) > 0) {
                if (start.leftChild == null) {
                    start.leftChild = new Node<>(elem, start);
                    size++;
                    return true;
                } else {
                    start = start.leftChild;

                }
            } else if (start.elem.compareTo(elem) <= 0) {
                if (start.rightChild == null) {
                    start.rightChild = new Node<>(elem, start);
                    size++;
                    return true;
                } else {
                    start = start.rightChild;
                }
            }
        }
        return false;
    }

    @Override
    public boolean remove(E elem) {
        return false;
    }

    @Override
    public boolean contains(E elem) {
        return node(elem) != null;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<E> node(E elem) {
        Node<E> result = null;
        if (isEmpty()) {
            return result;
        }
        for (Node<E> current = root; current != null; ) {
            if (elem.compareTo(current.elem) < 0) {
                current = current.leftChild;
            } else if (elem.compareTo(current.elem) > 0) {
                current = current.rightChild;
            } else {
                result = current;
                break;
            }
        }
        return result;
    }

    private Node<E> max(Node<E> node) {
        Node<E> max = node;
        while (max.rightChild != null) {
            max = max.rightChild;
        }
        return max;
    }




private static class Node<E> {
        E elem;
        Node<E> rightChild;
        Node<E> leftChild;
        Node<E> parent;

        public Node(E elem, Node<E> right, Node<E> left, Node<E> parent) {
            this.elem = elem;
            this.rightChild = right;
            this.leftChild = left;
            this.parent = parent;
        }

        public Node(E elem, Node<E> parent) {
            this.elem = elem;
            this.parent = parent;
        }
    boolean hasLeftChild() {
        return leftChild != null;
    }

    boolean hasRightChild() {
        return rightChild != null;
    }

    boolean hasParent() {
        return parent != null;
    }
    }
}



