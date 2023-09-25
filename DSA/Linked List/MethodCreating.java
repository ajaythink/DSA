// add first method creating 
// add last possion

// import java.lang.reflect.Method;

public class MethodCreating {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step1 = Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 = newNode next = head
        newNode.next = head;

        // step3 = head = newNode;
        head = newNode;
    }

    public static void main(String... args) {
        MethodCreating ll = new MethodCreating();
        ll.addFirst(1);
        ll.addFirst(4);

    }

}
