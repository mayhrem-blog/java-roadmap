public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  private static class Node {
    int value;
    Node next;

    Node (int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList (int value) {
    Node node = new Node(value);
    head = node;
    tail = node;
    length = 1;
  }

  public LinkedList () {
    this.length = 0;
  }

  
}
