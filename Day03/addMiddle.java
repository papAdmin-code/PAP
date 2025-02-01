class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node insertAfter(Node head, int key, int newData) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }

        if (curr == null)
            return head;
        Node newNode = new Node(newData);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        int key = 3;
        int newData = 4;

        System.out.print("Original list: ");
        printList(head);

        head = insertAfter(head, key, newData);

        System.out.print("Modified list: ");
        printList(head);

        // Test with key that is not in the list:
         System.out.print("List after trying to insert after key 7 (not in the list): ");
         head=insertAfter(head,7,8);
         printList(head);
    }
}