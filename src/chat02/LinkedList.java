package chat02;

/**
 * Created by sungyeon on 2018. 7. 18..
 */
public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);

        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public Node getNode(int element) {
        if (element == 0) {
            return head;
        }
        for (int i = 0; i < element; i++) {
            head = head.next;
        }

        return head;
    }

    public void printList() {
        Node temp = head;
        if (temp != null) {
            for (int i = 0; i < size; i++) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while(temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }

        str += temp.data;

        return str + "]";
    }

    // 중간에 추가
    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = getNode(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;

            size++;

            if (newNode.next == null) {
                tail = newNode;
            }
        }

    }

    // 첫번쨰 요소 삭제
    public Object removeFirst() {
        Node delNode = head;
        head = delNode.next;

        size--;

        return delNode.data;
    }

    // 중간 요소 삭제
    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        }
        Node prevNode = getNode(k - 1);
        Node delNode = prevNode.next;

        prevNode.next = prevNode.next.next;

        if (delNode == tail) {
            tail = prevNode;
        }

        size--;

        return delNode.data;
    }

    // 탐색
    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;

        while (temp.data != data) {
            temp = temp.next;
            index++;
            if (temp == null) {
                return -1;
            }
        }

        return index;
    }

    private class Node {
        Node next;
        Object data;
        public Node(Object d) {
            data = d;
            next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }

}
