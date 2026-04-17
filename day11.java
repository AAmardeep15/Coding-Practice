public class day11 {
    
    // Definition for a simple Linked List Node
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * Method to reverse the linked list
     * @param head Head of the original linked list
     * @return Head of the reversed linked list
     */
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            // 1. Store the next node
            next = current.next;
            
            // 2. Reverse the current node's pointer to point to prev
            current.next = prev;
            
            // 3. Move pointers one position ahead
            prev = current;
            current = next;
        }
        
        // At the end, 'prev' will be pointing to the new head
        return prev;
    }
    
    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a simple linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println("Original Linked List:");
        printList(head);
        
        // Reversing the linked list
        head = reverseList(head);
        
        System.out.println("\nReversed Linked List:");
        printList(head);
    }
}
