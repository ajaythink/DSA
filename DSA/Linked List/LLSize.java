public class LLSize {
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
    public int sizeOfLinkedList;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        sizeOfLinkedList++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        sizeOfLinkedList++;
        if (head == null) {
            head = tail = newNode;
        }
        // newNode = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void addMid(int index, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        sizeOfLinkedList++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.print("Linked List is Empty.");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String... args) {
        LLSize ll = new LLSize();
        ll.addMid(4, 44);
        ll.print();
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.print();
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.addMid(2, 10);
        ll.print();
        System.out.println(ll.sizeOfLinkedList);

    }

}
