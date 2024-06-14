package edu.escuelaing.arsw.ASE.app;
/**
 * Represents a node in a LinkedList.
 *
 * @param <T> Type of data stored in the node.
 */

public class Node<T> {
    private T data;
    private Node<T> next;
    /**
     * Constructs a node with given data.
     *
     * @param data Data to be stored in the node.
     */
    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
