package com.Queue;

import java.util.Arrays;

public class QueueDriver {
    public static void main(String[] args) {

        QueueClass queue=new QueueClass();
        queue.addObjects(2);
        queue.addObjects(4);
        queue.addObjects(6);
        queue.addObjects(8);
        System.out.println(queue.First());

        System.out.println("Remove first");
        System.out.println(queue.removeFirst());
        System.out.println(queue.First());

        System.out.println("Remove last");
        System.out.println(queue.removeLast());
        System.out.println(queue.last());


      QueueClass queueObj=new QueueClass();

        queueObj.addObjects(2);
        queueObj.addObjects(4);
        queueObj.addObjects(6);
        queueObj.addObjects(8);
        queueObj.addObjects(9);

        System.out.println("Queue to array:");
        System.out.println(Arrays.toString(queueObj.queueToArray()));

        System.out.println("Forward traversing:");
        queueObj.forwardTraversing();

        System.out.println("\n\nBackward traversing:");
        queueObj.backwardTraversing();

        System.out.println("\n\nRemove second element:");
        System.out.println(queueObj.removeSecondNode());
        queueObj.First();
        queueObj.forwardTraversing();

        System.out.println("\n\nSearch Node by position:");
        System.out.println(queueObj.searchNodeByPosition(1));

        System.out.println("\n\nSearch Node by Data:");
        System.out.println(queueObj.serachNodeByData(9));

        System.out.println("\nDealing with queue with size zero or empty");

         QueueClass queue2=new QueueClass();

         queue2.forwardTraversing();







    }
}
