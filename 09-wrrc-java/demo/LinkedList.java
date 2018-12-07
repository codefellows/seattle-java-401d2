import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class LinkedList {
  public Node head;

  public static void main(String[] args) {
    try {
      URL url = new URL("http://nflarrest.com/api/v1/crime");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      System.out.println("about to send request");
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      System.out.println("request came back");
      String inputLine;
      //StringBuffer content = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        System.out.println(inputLine);
      }
      in.close();
    } catch (IOException e) {
      // something went wrong with the internet
      System.out.println("The Internet is down, but please don't commit crimes");
      System.out.println(e);
    }
    // LinkedList list1 = new LinkedList();
    // LinkedList list2 = new LinkedList();
    // list1.head = new Node(1, new Node(2, new Node(3, new Node(12, new Node(6, null)))));
    // list2.head = new Node(4, new Node(5, new Node(6, null)));
    // LinkedList result = merge(list1, list2);
    // System.out.println(result);
  }

  public String toString() {
    return "LinkedList: " + this.head;
  }

  public static LinkedList merge(LinkedList list1, LinkedList list2) {
    LinkedList answer = new LinkedList();
    answer.head = list1.head;
    Node nextFromOne = list1.head.next;
    answer.head.next = list2.head;
    Node nextFromTwo = list2.head.next;
    Node lastInAnswer = answer.head.next;
    while(nextFromOne != null || nextFromTwo != null) {
      if(nextFromOne != null) {
        lastInAnswer.next = nextFromOne;
        lastInAnswer = lastInAnswer.next;
        nextFromOne = nextFromOne.next;
      }
      if(nextFromTwo != null) {
        lastInAnswer.next = nextFromTwo;
        lastInAnswer = lastInAnswer.next;
        nextFromTwo = nextFromTwo.next;
      }
    }
    return answer;
  }
}

class Node {
  public int value;
  public Node next;
  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public String toString() {
    return "N(" + this.value + ", " + this.next + ")";
  }
}