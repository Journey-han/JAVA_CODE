package ch03;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {

        MyListNode newNode;     // 새로 들어갈 노드
        if (head == null) {     // 맨 처음 일때. 첫 노드일 때
            newNode = new MyListNode(data);
            head = newNode;
        } else {  // 첫 번째 노드가 아닐 경우 맨 뒤에 넣기
            newNode = new MyListNode(data);
            // 맨 뒤 찾기. head 부터 돌면서 찾는다.
            // 맨 마지막 노드는 헤드에서부터 찾아간다. 맨 뒤는 null을 가리킴
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;   // temp의 next 노드를 가리킨다.
            }
            temp.next = newNode;    // 마지막이 temp. 새로 들어가는 노드가 newNode
        }

        count++;
        return newNode;
    }

    // 중간에 들어가는 노드. 앞의 previous 노드를 찾아야 한다.
    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;     // 앞의 노드

        MyListNode newNode = new MyListNode(data);      // 추가할 노드

        if(position < 0 || position > count ){
            System.out.println("추가 할 위치 오류났음. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  // 맨 앞으로 들어가는 경우. head가 된다.
            newNode.next = head;
            head = newNode;
        }
        else{       // 중간에 들어갈 경우.
            for(i=0; i<position; i++){
                preNode = tempNode;     // prenode를 찾는다.
                tempNode = tempNode.next;

            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i;

        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position >= count ){
            System.out.println("삭제 할 위치 오류났음. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  // 맨 앞을 삭제하는
            head = tempNode.next;
        }
        else{           // 중간 삭제.
            for(i=0; i<position; i++){
                preNode = tempNode;     // 지위지는 위치 tempNod
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류났음. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  // 찾으려는 위치가 맨 처음인 경우. head

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류났음. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  // 검색하는 위치가 맨 처음인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }
}
