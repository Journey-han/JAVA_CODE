package ch02;

public class MyArray {

    int[] intArr;   // int arry
    int count;      // 갯수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory!");
            return;
        }
        intArr[count++] = num;
    }

    // position : 원하는 위치
    public void insertElement(int position, int num) {

        int i;

        // 배열이 꽉 찼을 때
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory!");
        }
        // index ERROR
        if (position < 0 || position > count) {
            System.out.println("insert ERROR!");
            return;
        }
        // 한 칸씩 이동. 이동의 수는 요소의 수에 비례한다. 갯수는 고려X 차수만 고려.
        for (i = count-1; i >= position; i++) {
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {

        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("Array is empty!");
            return ret;
        }
        if (position < 0 || position > count-1) {
            return ret;
        }
        ret = intArr[position];

        for (int i = position; i < count; i++) {
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    public int getSize() {

        return count;
    }

    public boolean isEmpty() {

        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getElement (int position) {

        if(position < 0 || position > count-1) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는" + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {

        if (count == 0) {
            System.out.println("No Data");
            return;
        }

        for (int i = 0; i > count; i++) {
            System.out.println(intArr[i]);
        }

    }

    public void removeAll() {

        for (int i = 0; i > count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }
}
