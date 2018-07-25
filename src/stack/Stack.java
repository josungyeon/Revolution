package stack;

import java.util.EmptyStackException;

/**
 * Created by sungyeon on 2018. 7. 23..
 */
public class Stack<T> {
    StackNode top;

    public T push(T item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
        return item;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = (T) top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return (T) top.data;
    }

    public Boolean isEmpty() {
        return top == null;
    }

    private class StackNode<T> {
        private T data;
        private StackNode next;

        private StackNode(T data) {
            this.data = data;
        }
    }

}
