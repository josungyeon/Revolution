package linkedList;

import linkedList.LinkedList;

/**
 * Created by sungyeon on 2018. 7. 18..
 */
public class Algo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
//        list.add(1, 15);

//        list.removeFirst();
//        list.remove(2);
//        list.printList();
        System.out.println(list.indexOf(30));
        System.out.println(list.toString());
//        System.out.println(list.getNode(0));
    }

}
