class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveDuplicates {

    static Node remove(Node head) {

        Node temp = head;

        while(temp != null && temp.next != null) {

            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }

    static void display(Node head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);

        head = remove(head);

        display(head);
    }
}