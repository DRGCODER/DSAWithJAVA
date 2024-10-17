public class LinkedListStack {
    Node head;

    public LinkedListStack(Node node) {
        this.head = node;
    }

    public void push(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        head = head.next;
    }

    public void displayValues() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
