package org.dataStructure.linkLisk;

/**
 * description: 反转链表
 * author: 黄冠瑛
 * date: 2022/11/23 9:45
 */
public class ReverseList {

    public static SingleLinkList reverse(SingleLinkList s){
        if(s.next==null){return s;}
        SingleLinkList<String> head = new SingleLinkList<String>("0", 0);
        SingleLinkList temp = s;
        SingleLinkList next = null;
        while (temp!=null){
            next=temp.next;
            temp.next = head.next;
            head.next = temp;
            temp = next;
        }
        return head.next;
    }
}
