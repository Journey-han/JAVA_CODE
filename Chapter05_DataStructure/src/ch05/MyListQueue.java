package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}

public class MyListQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {

        MyListNode newNode;

        // 비어있는 큐에 맨 처음으로 들어갈 때. 맨 앞에서 넣을 때
        if(isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }else{
            // 맨 뒤로 들어갈 때.
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added!");
    }

    @Override
    public String deQueue() {

        if (isEmpty()) {
            return null;
        }

        String data = front.getData();
        front = front.next;

        if(front == null) {
            rear = null;
        }

        return data;
    }

    @Override
    public void printQueue() {

        printAll();
    }
}
