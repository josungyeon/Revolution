package chat03;

import java.util.NoSuchElementException;

/**
 * Created by sungyeon on 2018. 7. 23..
 */
public class Queue<T> {
    QueueNode top;
    QueueNode tail;

    public Queue() {
        top = null;
        tail = null;
    }

    /* 새로운 리스트를 리스트의 끝부분에 추가 */
    public void add(T item) {
        QueueNode newNode = new QueueNode(item);

        if (isEmpty()) {
            top = newNode;
            tail = top;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /* 리스트의 index 번째 항목을 반환 */
    public T get(int index) {
        QueueNode item = top;

        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return (T) top.data;
        }

        for (int i = 0; i < index; i++) {
            item = item.next;
        }

        return (T) item.data;
    }

    /* 리스트의 첫 번째 항목을 제거 */
    public T remove() {
        T removeTarget = (T) top.data;

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        top = top.next;

        if (top.next == null) {
            tail = top;
        }

        return removeTarget;
    }

    /* 큐에서 가장 위에 있는 항목을 반환 */
    public T peek() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        }

        return (T) top.data;
    }

    public Boolean isEmpty() {
        return top == null;
    }


    private class QueueNode<T> {
        private T data;
        private QueueNode next;

        QueueNode(T item) {
            data = item;
        }
    }
}
