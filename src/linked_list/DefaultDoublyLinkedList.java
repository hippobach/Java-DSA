package linked_list;
import java.util.Iterator;

public class DefaultDoublyLinkedList<T> implements DoublyLinkedList<T>{
    private int size;
    private Node<T> head = null;
    private Node<T> tail = null;

    public void clear() {
        Node<T> currentNode = head;
        while(currentNode != null) {
            Node<T> nextNode = currentNode.getNext();
            currentNode.setNext(null);
            currentNode.setPrev(null);
            currentNode.setData(null);
            currentNode = nextNode;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void add(T element) {
        addLast(element);
    }

    @Override
    public void addFirst(T element) {
        if(isEmpty()) {
            head = tail = new Node<>(element, null
                    , null
            );
        } else {
            Node<T> newNode = new Node<>(element, null, head);
            head.setPrev(newNode);
            head = head.getPrev();
        }
    }

    @Override
    public void addLast(T element) {
        if(isEmpty()) {
            head = tail = new Node<>(element, null
                    , null
            );
        } else {
            Node<T> newNode = new Node<>(element, tail, null);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(Node<T> node) {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public T removeAt(int index) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
