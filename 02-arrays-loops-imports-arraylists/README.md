# Class 2: Arrays, Loops, Imports, ArrayLists
## Resources
* [Java Tutorials: docs.oracle.com](https://docs.oracle.com/javase/tutorial/)
* [Whiteboard example image](../DataStructuresWhiteboard.PNG)
* [Pseudocode overview](../Pseudocode.md)

## Agenda
- Welcome, announcements
- Code review
- Warmup questions
- Lecture
  - Recap of array types
  - What are imports and how do they work
  - ArrayLists and polymorphism
  - Testing
- Lab intro
  - How to whiteboard & pseudocode

## Topics
* arrays
* loops
* imports
* ArrayLists
* testing

## Array Warmup
1. What does the syntax look like to create an array with the numbers `1,2,3`?
2. How do we get the length of an array?
3. How do we get or update the value at a particular index of an array?
4. What are some ways we can loop through an array?

### Arrays
Create a new file called `CollectionsDemo.java`.

Add the following boilerplate code:
```java
public class CollectionsDemo {

  public static void main(String[] args){

  }
}
```

Let's review: which of these terms do we understand? Which do we not?

When ready, continue by writing the following method:
```java
public static void arrayTest(){
  String[] family = {"Adam", "Amanda", "Mika"};

  for (int i = 0; i < family.length; i++) { //iterate over each role in roles array.
    System.out.println(family[i]);
  }

}
```

Then call in the `main()` method.
```java
arrayTest();
```

We can also write for loops that are more like a for/of loop in JS:
```java
for (String member : family) {
  System.out.println(member);
}
```

### Limitations of Arrays

- specific number of items
- can never add a new item or remove an item, only replace
- only one data type

### ArrayLists
ArrayLists allow us to get around some of the limitations of arrays. They require more effort to use, and run slower in code, but give us the flexibility we know and love from JavaScript.

```java
import java.util.ArrayList;

public static void main(String[] args) {
  ArrayList<String> arrayList = new ArrayList<>();
  arrayList.add("Hello");
  arrayList.add("World");
  for (String elt : arrayList) {
    System.out.println(elt);
  }
  arrayList.add("!");
  for (String elt : arrayList) {
    System.out.println(elt);
  }
}
```

### Limitations of ArrayLists
- have to import
- the constructor is weird
- still have to declare the type of elements inside
- still only one data type
