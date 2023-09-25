public class LLHeadAndTail {
    public static class Node {// Node class I have created
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String... args) {
        LLHeadAndTail ll = new LLHeadAndTail();
        // ll.head = new Node(1); head at place of data store 1
        // ll.head.next = new Node(2); and also at the place of head next there store
        // the data 2;
        // It is not good for the performing the opration in likedlist
        // all Opration will perform by method. like add(), remove(), search();
    }

}
