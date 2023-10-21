public class LinkedList<T> {
    private int length;
    private Node<T> head;

    public LinkedList() {
        this.length = 0;
        this.head = null;
    }

    public void insert(T data) {
        Node<T> node = new Node<T>(data);
        this.length++;

        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = this.head;
        this.head = node;
    }

    public T delete(T data) {
        if (head == null) {
            return null;
        }

        if (head.data.equals(data)) {
            T deletedData = head.data;
            head = head.next;
            length--;

            return deletedData;
        }

        Node<T> cur = head;
        while (cur.next != null && !cur.next.data.equals(data)) {
            cur = cur.next;
        }

        if (cur.next == null) {
            return null;
        }

        T deletedData = cur.next.data;
        cur.next = cur.next.next;
        length--;

        return deletedData;
    }
}