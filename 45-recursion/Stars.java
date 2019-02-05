public class Stars {
  public static void main(String[] args) {
    // printDoublePyramid(Integer.parseInt(args[0]));
    LinkedListNode lst = new LinkedListNode(0, new LinkedListNode(4, new LinkedListNode(5, new LinkedListNode(7, null))));
    System.out.println(lst);
    System.out.println(reverse(lst));
  }


  public static String getStars(int n) {
    if (n < 1) {
      return "";
    } else {
      return "*" + getStars(n - 1);
    }
  }

  public static void printInversePyramid(int n) {
    if (n > 0) {
      // print the rest of the pyramid
      printInversePyramid(n-1); // n-1 work, n-1 times

      System.out.println(getStars(n)); // n work
    }
  }

  public static void printDoublePyramid(int n) {
    if (n > 0) {
      System.out.println(getStars(n));
      printDoublePyramid(n - 1);
      System.out.println(getStars(n));
    }
  }

  public static int getLength(LinkedListNode n) {
    if (n == null) {
      return 0;
    } else {
      return 1 + getLength(n.next);
    }
  }

  public static LinkedListNode reverse(LinkedListNode curr) {
    return reverseForHeadAndTail(curr).head;
  }

  public static HeadAndTail reverseForHeadAndTail(LinkedListNode curr) {
    if (curr ==  null || curr.next == null) {
      return new HeadAndTail(curr, curr);
    } else {
      HeadAndTail ans = reverseForHeadAndTail(curr.next);
      ans.tail.next = curr;
      curr.next = null;
      return new HeadAndTail(ans.head, curr);
    }
  }
}

class LinkedListNode<T> {
  T value;
  LinkedListNode<T> next;

  public LinkedListNode(T value, LinkedListNode<T> next) {
    this.value = value;
    this.next = next;
  }

  public String toString() {
    return this.value + "->" + (this.next == null ? "null" : this.next.toString());
  }
}

class HeadAndTail<T> {
  public LinkedListNode<T> head;
  public LinkedListNode<T> tail;

  public HeadAndTail(LinkedListNode<T> head, LinkedListNode<T> tail) {
    this.head = head;
    this.tail = tail;
  }
}