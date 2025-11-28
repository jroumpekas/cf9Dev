package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

import static gr.aueb.cf.cf9.ch6.StackApp.stack;

/**
 * Queue are FIFO(First in First out) logic.
 * Implemented with:
 * enqueue()
 * dequeue()
 */

public class QueueApp {

    static int[] queue = new int[10];
    static int top = -1;


    public static void main(String[] args) {
        int num = 0;
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);

       // print(queue)



    }

    public static int enqueue(int val){
        queue[++top] = val;
        return val;
    }

    public static int dequeue(int val){

       int num;

       if (isEmpty()){
           throw new RuntimeException("Queue is empty!");
       }
       num = queue[0];

        queue = Arrays.copyOfRange(queue, 1,  queue.length + 1);
        top--;
        return num;
    }

    public static boolean isEmpty(){
        return top == -1;

    }

    public static boolean isFull(){
        return top == stack.length - 1;
    }

}
