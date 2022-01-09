package ch04;

import ch02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    // 삽입
    public void push(int data) {

        if (isFull()) {
            System.out.println("stack is FULL!!");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    // 꺼내기
    public int pop() {

        if (isEmpty()) {
            System.out.println("stack is EMPTY!!");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("stack is EMPTY!!");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.getElement(--top);
    }

    // 스택에 data 삽입시 꽉 찼는지 확인해야한다.
    public boolean isFull() {

        if (top == arrayStack.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    // 스택에 data가 비어있는지 확인
    public boolean isEmpty() {

        // top이 0인건 없다는 뜻.
        if (top == 0) {
            System.out.println("stack is EMPTY!!");
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayStack.printAll();
    }

}
