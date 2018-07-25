package stack;

/**
 * Created by sungyeon on 2018. 7. 23..
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("## Stack");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // 예제) 스택 2개로 큐 구현하기

    }
}
