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

  // ? Create a new Node to add to the Linked List
  //? Check if the Linked List is not empty
  // ? In case the Linked List is not empty
  // ? Create temp file to point the tail node to temp and then use the pointers
  // ? new node points to temp
  // ? temp.next points to new node
  // ? tail points to new node
  public void append (int value) {
    Node node = new Node(value);
    //? Check if the list is empty 
    if (length == 0) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    length++;
  } 

  // ? Check if the list is not empty
  // ? If the list is empty -> return null
  // ? Create nodes -> before and current
  // ? If the list has only one element -> point head and tail to null and remove element 
  // ? If the list has more than one element 
  public Node removeLast () {
    if (length == 0) return null;
    Node current = head;
    Node before = head;

    //? Traverse the linked list until until the end of the list
    while (current.next != null) {
      before = current;
      current = current.next;
    }

    //? Check if the list has only one element
    if (current == head) {
      head = null;
      tail = null; 
    } else {
      before.next = null;
      tail = before;
    }
    length--;
    return current;
  }

  public void print () {
    Node current = head;
    System.out.println("Linked List - elements ("+length+")");
    while (current != null) {
      System.out.println("Value -->"+current.value);
      current = current.next;
    }
  }

  // ? Adding the element to the fist of the list
  //? Point current 
  public Node prepend (int value) {}
  
}
