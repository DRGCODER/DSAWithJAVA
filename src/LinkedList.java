public class LinkedList {
    Node head;

    public LinkedList(Node node) {
        this.head = node;
    }

    public void addValue(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void removeValue() {
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
