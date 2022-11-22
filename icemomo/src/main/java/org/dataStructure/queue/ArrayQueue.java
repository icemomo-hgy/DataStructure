package org.dataStructure.queue;

/**
 * description: 利用数组实现的环形队列
 * author: 黄冠瑛
 * date: 2022/11/22 15:58
 */
public class ArrayQueue<T>  {
    int size ;
    int rear;
    int font;
    Object array [];
    public ArrayQueue(int size){
        this.size = size+1;
        this.array= new Object [size+1];
    };

    //判断队列是否满
    boolean isFull(){
        return (rear+1)%size == font;
    }
    //判断队列是否空
    boolean isEmpty(){
        return rear == font;
    }
    //入队列
   public void add(T t){
        if(isFull()){
            throw new RuntimeException("队列满");
        }
        array[rear] = t;
        rear =  (rear+1)%size;
    }
    //出队列
    public T pop(){
        if(isEmpty()){
            System.out.println("队列空");
            return null;
        }
        T res = (T)array[font];
        font = (font+1)%size;
        return res;
    }

    //查询当前队列有效数
   public int getLength(){
        return (rear-font+size)%size;
    }
}
