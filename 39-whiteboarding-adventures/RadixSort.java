import java.util.Arrays;
import java.util.LinkedList;

public class RadixSort {
  public static void main (String[] args) {
    System.out.println(Arrays.toString(radixSort(new int[] {432, 617, 888, 902, 463, 581, 713})));
  }

  public static int[] radixSort(int[] input) {
    if (input.length < 1) {
      return input;
    }
    int numDigits = ((int) Math.log10(input[0])) + 1;
    for (int d = 0; d < numDigits; d++) {
      LinkedList<Integer>[] sorted = new LinkedList[10];
      for (int i = 0; i < sorted.length; i++) {
        sorted[i] = new LinkedList<Integer>();
      }
      for (int i = 0; i < input.length; i++) {
        int digit = (input[i] / (int)Math.pow(10, d)) % 10;
        sorted[digit].add(input[i]);
      }
      int idx = 0;
      for (int i = 0; i < sorted.length; i++) {
        for (Integer num : sorted[i]) {
          input[idx] = num;
          idx++;
        }
      }
      System.out.println(Arrays.toString(input));
    }
    return input;
  }
}
