package queue;

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

    public void add(T item) {
        // 새로운 노드 추가
        QueueNode newNode = new QueueNode(item);

        if (isEmpty()) {
            top = newNode;
            tail = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

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
