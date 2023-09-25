public class AddInMiddle {
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
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMid(int idx, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        int i = idx;
        Node newNode = new Node(data);
        Node temp = head;
        while (i >= 2) {
            temp = temp.next;
            i--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Emply Linkedlist");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String... args) {
        AddInMiddle ll = new AddInMiddle();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(8);
        ll.addMid(1, 5);
        ll.print();

    }
}
