package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void testGet() {
    var list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);

    assertEquals(1, App.get(list, 0));
    assertEquals(2, App.get(list, 1));
    assertEquals(3, App.get(list, 2));
  }

  @Test
  void testSet() {
    var list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    App.set(list, 0, 4);

    assertEquals(4, list.head.data);
    assertEquals(2, list.head.next.data);
    assertEquals(3, list.head.next.next.data);
  }

  @Test
  void testRemove() {
    var list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    App.remove(list, 1);

    assertEquals(1, list.head.data);
    assertEquals(3, list.head.next.data);
  }

  @Test
  void testReverse() {
    var list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    var reversed = App.reverse(list);

    assertEquals(3, reversed.head.data);
    assertEquals(2, reversed.head.next.data);
    assertEquals(1, reversed.head.next.next.data);
  }

  @Test
  void testIsSortedAscending() {
    var list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    assertTrue(App.isSortedAscending(list));
  }

  @Test
  void testIsSortedAscending2() {
    var list = new LinkedList();
    list.append(3);
    list.append(2);
    list.append(1);
    assertFalse(App.isSortedAscending(list));
  }
}
