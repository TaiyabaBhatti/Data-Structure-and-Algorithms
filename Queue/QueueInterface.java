package com.Queue;
// Interface members are public no need to explicitly mention
public interface QueueInterface {

    void addObjects(Object ob);

     int size();

     Object First();

     Object removeFirst();
     Object removeLast();
     Object removeSecondNode();
     Object last();

     Object[] queueToArray();

     void forwardTraversing();
     void backwardTraversing();
     Object searchNodeByPosition(int position);

     boolean serachNodeByData(Object data);
     void isEmpty();




}
