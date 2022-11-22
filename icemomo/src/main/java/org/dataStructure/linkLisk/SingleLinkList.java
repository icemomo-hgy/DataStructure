package org.dataStructure.linkLisk;

import lombok.Data;

/**
 * description: 单项链表
 * author: 黄冠瑛
 * date: 2022/11/22 16:34
 */
@Data
public class SingleLinkList<T> {

     T data;
     int num;
    SingleLinkList next;

    public  SingleLinkList(T data,int num){
        this.data = data;
        this.num  = num;
    }

    //添加
    public void add(SingleLinkList s) {
        SingleLinkList temp = this;
        while (temp != null) {
            if (temp.num == s.num) {
                return;
            }
            if(temp.num>s.num){
            s.next = temp.next;
            temp.next = s;
            return;
            }else {
                if(temp.next==null){
                    temp.next = s;
                }
                temp=temp.next;
            }
        }
        }

    // 删除
    public void delete(int num){
        SingleLinkList temp=this;
        if(temp.next==null&&temp.num==num){
            temp = null;
        }
        while (temp.next!=null){
            if(temp.next.num == num){
              temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    }
