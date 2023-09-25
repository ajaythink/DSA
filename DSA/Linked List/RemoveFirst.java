import java.io.*;

public class RemoveFirst {
    // static PrintWriter out = new PrintWriter(System.out);

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
    public static int sizeLL;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        sizeLL++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        sizeLL++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
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
        sizeLL++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (sizeLL == 0) {
            System.out.println("Linked list is empty.");
            return;
        } else if (sizeLL == 1) {
            head = tail = null;
            sizeLL = 0;
            return;
        }
        head = head.next;
        sizeLL--;
    }

    public void removeLast() {
        if (sizeLL == 0) {
            System.out.println("Linked List is Empty.");
        } else if (sizeLL == 1) {
            int val = head.data;
            head = tail = null;
            sizeLL = 0;
        }
        Node prev = head;
        for (int i = 0; i < sizeLL - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        sizeLL--;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void print() {
        if (head == null) {
            System.out.print("Linked List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverseLL() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public Node midNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null && head.next == null) {
            return true;
        }
        // step 1 : Find mid Node
        Node midNode = midNode();
        // setp2: half reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String... args) {
        PrintWriter out = new PrintWriter(System.out);
        RemoveFirst ll = new RemoveFirst();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(0);
        ll.print();
        // ll.addMid(2, 9);
        // ll.addLast(10);
        System.out.println(ll.findMid());
        System.out.println(ll.checkPalindrome());
        ll.print();

        out.close();
    }

}
