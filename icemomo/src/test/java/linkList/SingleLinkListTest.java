package linkList;

import org.dataStructure.linkLisk.SingleLinkList;
import org.junit.Test;

/**
 * description: 单项链表
 * author: 黄冠瑛
 * date: 2022/11/22 17:04
 */
public class SingleLinkListTest {
    @Test
    public void  test(){
        SingleLinkList node0 = new SingleLinkList("node0", 0);
        SingleLinkList node2 = new SingleLinkList("node2", 2);
        SingleLinkList node1 = new SingleLinkList("node1", 1);
        SingleLinkList node3 = new SingleLinkList("node3", 3);
        node0.add(node1);
        node0.add(node2);
        node0.add(node3);
        node0.delete(1);
        node0.delete(2);
        System.out.println(node0);
    }
}
