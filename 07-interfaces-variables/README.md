# Class 7: Interfaces and Variables (and other relationships between classes)

## Agenda
- Announcements
  - none?
- Code review
- Daily Systems: files and the filesystem
- Warmup questions
- Lecture
- Lab intro

## Warmup Questions
1. What's the difference between an interface and a parent class?
2. What are some different relationships that can exist between different classes?
3. What's a `toString` method?
4. What's the output of this code? (predictions, don't run it)
    ```java
    int a = 5;
    int b = a;
    a = 6;
    System.out.println(b);
    ```
5. What's the output of this code? (predictions, don't run it)
    ```java
    int[] nums = new int[]{1,2,3,4};
    int[] moreNums = nums;
    nums[0] = 7;
    System.out.println(moreNums[0]);
    ```
6. Why does that make any sense?

### Lists vs. ArrayLists vs. LinkedLists

Which should you use? Why?
