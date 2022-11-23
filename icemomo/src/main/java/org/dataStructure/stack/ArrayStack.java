package org.dataStructure.stack;

/**
 * description: 栈
 * author: 黄冠瑛
 * date: 2022/11/23 10:47
 */
public class ArrayStack {
     int top = -1;
    Object[] array= null;
    int masSize;
    public ArrayStack(int masSize){
        this.masSize = masSize;
        array = new Object[masSize];
    }
    //判断队列是否为空
    public boolean isEmpty (){
        return top ==-1;
    }
    //判断队列是否满
    public boolean isFull(){
        return top == masSize-1;
    }
    //入队列
    public void add(Object t){
        if(isFull()){
            return;
        }
        array[++top] = t;
    }

    //出队列
    public Object pop(){
        if(isEmpty()){
            return null;
        }
        return array[top--];
    }
    //显示队列


}
