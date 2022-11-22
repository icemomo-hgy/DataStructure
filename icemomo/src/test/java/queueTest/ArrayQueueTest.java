package queueTest;

import org.dataStructure.queue.ArrayQueue;
import org.junit.Test;

/**
 * description:
 * author: 黄冠瑛
 * date: 2022/11/22 16:17
 */

public class ArrayQueueTest {
    @Test
    public void test(){
        ArrayQueue<String> queue = new ArrayQueue<String>(5);
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        System.out.println(queue.pop()+"出队列");
        System.out.println(queue.pop()+"出队列");
        System.out.println("剩余"+queue.getLength());

    }

}
