package assignment;

public class LinkedList {

  public class Node {
    public int data;
    public Node next;

    public Node(int data) {
      this(data, null);
    }

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public Node head;

  public LinkedList() {
    this.head = null;
  }

  public int length() {
    int length = 0;
    LinkedList.Node item = head;
    while (item != null) {
      length++;
      item = item.next;
    }
    return length;
  }

  public void prepend(int value) {
    LinkedList.Node newHead = new LinkedList.Node(value);
    newHead.next = head;
    head = newHead;
  }

  public void append(int value) {
    LinkedList.Node newTail = new LinkedList.Node(value);
    if (head == null) {
      head = newTail;
      return;
    }
    LinkedList.Node item = head;
    while (item.next != null) {
      item = item.next;
    }
    item.next = newTail;
  }
}
