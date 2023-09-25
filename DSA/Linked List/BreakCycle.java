public class BreakCycle {
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

    public static void print() {

        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean cycleOrNot() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void breakCycle() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        Node prev = null;
        slow = head;
        while (fast != slow) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    static public void main(String... ar) {
        head = new Node(1);
        head.next = new Node(3);
        Node temp = new Node(2);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = temp;

        // print();
        System.out.println(cycleOrNot());
        breakCycle();
        System.out.println(cycleOrNot());

        print();
    }

}
