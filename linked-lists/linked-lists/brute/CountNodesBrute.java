class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CountNodesBrute {

    static int count(Node head) {

        int c = 0;

        Node temp = head;

        while(temp != null) {
            c++;
            temp = temp.next;
        }

        return c;
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        System.out.println(count(head));
    }
}