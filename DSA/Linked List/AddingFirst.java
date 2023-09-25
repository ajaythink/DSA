public class AddingFirst {
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
        }
        newNode.next = head;

        head = newNode;

    }

    static public void main(String args[]) {
        AddingFirst ll = new AddingFirst();
        ll.addFirst(43);
        ll.addFirst(42);
    }

}
