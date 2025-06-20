package assignment;

public class App {

  public static int get(LinkedList list, int index) {
    var item = list.head;

    for (int i = 0; i < list.length(); i++) {
      if (i < index) {
        item = item.next;
      }
    }

    return item.data;
  }

  public static void set(LinkedList list, int index, int value) {
    var item = list.head;

    for (int i = 0; i < list.length(); i++) {
      if (i == index) {
        item.data = value;
        return;
      }
      item = item.next;
    }
  }

  public static void remove(LinkedList list, int index) {
    if (index == 0) {
      list.head = list.head.next;
    } else {
      var current = list.head;
      
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }

      current.next = current.next.next;
    }
  }

  public static LinkedList reverse(LinkedList list) {
    LinkedList reversedList = new LinkedList();
    var item = list.head;
    while (item != null) {
      reversedList.prepend(item.data);
      item = item.next;
    }
    return reversedList;
  }

  public static boolean isSortedAscending(LinkedList list) {
    for (int i = 0; i < list.length() - 1; i++) {
      if (get(list, i) > get(list, i + 1)) {
        return false;
      }
    }
    return true;
  }

  private App() {}
}
