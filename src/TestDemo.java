/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-07-31
 * Time:22:16
 **/
public class TestDemo {
    public static Node  twoMergerList(Node headA,Node headB){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA != null && headB != null){
            if (headA.getData() < headB.getData()){
                tmp.setNext(headA);

                headA = headA.getNext();
                tmp = tmp.getNext();
            }else {
                tmp.setNext(headB);

                headB = headB.getNext();
                tmp = tmp.getNext();
            }
        }
        if (headA != null){
            tmp.setNext(headA);
        }
        if (headB != null){
            tmp.setNext(headB);
        }
        return newHead.getNext();
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();

        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);
        myLinkedList1.addLast(11);
        myLinkedList1.addLast(18);
        myLinkedList1.addLast(26);
        myLinkedList1.addLast(32);
        myLinkedList1.addLast(41);
        Node ret =twoMergerList(myLinkedList.head,myLinkedList1.head);
        myLinkedList.display2(ret);
    }
}
