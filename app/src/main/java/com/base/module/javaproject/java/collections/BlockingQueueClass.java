package com.base.module.javaproject.java.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: llzhu
 * @CreateDate: 21-12-1 下午3:17
 * @Description: 阻塞队列
 */
public class BlockingQueueClass {
    public static void main(String[] args) {


        BlockingQueueClass blockingQueueClass = new BlockingQueueClass();
        blockingQueueClass.initDelayQueue();
    }

    public void init() {
        // BlockingQueue 是一个接口
        // LinkedBlockingQueue
        // LinkedTransferQueue
        //ConcurrentLinkedQueue
        //put()----> take()  队列满了或者队列为空，会阻塞

//        ConcurrentLinkedQueue<String> concurrentLinkedQueue=new ConcurrentLinkedQueue();
//        concurrentLinkedQueue.add("1");//队列满了，抛出异常
//        concurrentLinkedQueue.remove("1");//队列空了，抛出异常
//
//        concurrentLinkedQueue.offer("2");//队列满了，返回false
//        concurrentLinkedQueue.poll();//Retrieves and removes the head of this queue,
//
//        concurrentLinkedQueue.peek();//Retrieves, but does not remove, the head of this queue,


    }

    public void initLinkedBlockingQueue() {
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(1);
//        System.out.println("linkedBlockingQueue.add(\"1\") = " + linkedBlockingQueue.add("1"));
//        System.out.println("linkedBlockingQueue.remove() = " + linkedBlockingQueue.remove());
//        System.out.println("linkedBlockingQueue.add(\"2\") = " + linkedBlockingQueue.add("2"));

//        System.out.println("linkedBlockingQueue.offer(\"1\") = " + linkedBlockingQueue.offer("1"));
//        System.out.println("linkedBlockingQueue.offer(\"1\") = " + linkedBlockingQueue.offer("2"));

//        System.out.println("linkedBlockingQueue.peek() = " + linkedBlockingQueue.peek());
//        System.out.println("linkedBlockingQueue.poll() = " + linkedBlockingQueue.poll());
//        System.out.println("linkedBlockingQueue.poll() = " + linkedBlockingQueue.poll());

        try {

            linkedBlockingQueue.put("");
            linkedBlockingQueue.take();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void initSynchronousQueue() {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        try {
            synchronousQueue.put("");
            synchronousQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 排序的队列
     */
    public void initPriorityBlockingQueue() {
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue();
        priorityBlockingQueue.put("s");
        priorityBlockingQueue.put("d");
        priorityBlockingQueue.put("z");
        priorityBlockingQueue.put("e");
        priorityBlockingQueue.put("a");
        int size = priorityBlockingQueue.size();
        for (int i = 0; i < size; i++) {


            System.out.println("priorityBlockingQueue.poll() = " + priorityBlockingQueue.poll());
//            try {
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    /**
     * 排序的队列,底层通过PriorityQueue 实现
     */
    public void initDelayQueue(){
        DelayQueue delayQueue=new DelayQueue();
        delayQueue.add(new PDelay(1));
        delayQueue.add(new PDelay(10));
        delayQueue.add(new PDelay(5));
        delayQueue.add(new PDelay(6));
        delayQueue.add(new PDelay(2));
        int size=delayQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("delayQueue.poll() = " + delayQueue.poll());
        }
    }
    class PDelay implements Delayed {
        int pseudodelay;
        PDelay(int i) { pseudodelay = i; }
        public int compareTo(PDelay other) {
            int a = this.pseudodelay;
            int b = other.pseudodelay;
            return (a < b) ? -1 : (a > b) ? 1 : 0;
        }
        public int compareTo(Delayed y) {
            return compareTo((PDelay)y);
        }
        public boolean equals(Object other) {
            return (other instanceof PDelay) &&
                    this.pseudodelay == ((PDelay)other).pseudodelay;
        }
        // suppress [overrides] javac warning
        public int hashCode() { return pseudodelay; }
        public long getDelay(TimeUnit ignore) {
            return Integer.MIN_VALUE + pseudodelay;
        }
        public String toString() {
            return String.valueOf(pseudodelay);
        }
    }
    class Delay implements Delayed{
        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }
}
