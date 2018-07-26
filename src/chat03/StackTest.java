package chat03;

/**
 * Created by sungyeon on 2018. 7. 23..
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
