package chat03;

/**
 * Created by sungyeon on 2018. 7. 23..
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        /* 큐에서 가장 위에 있는 항목을 반환 */
        System.out.println(queue.peek());

        while(queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
