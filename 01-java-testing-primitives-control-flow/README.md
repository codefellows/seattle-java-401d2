# Class Kickoff and Intro to Java

Welcome to Day 1 of Code 401: Java! We're excited to have you here. Today's focus will be on reviewing the basics from the prework and ensuring you have the basic development tools that you'll need to succeed in this course.

## Resources
* [Common Problems and Their Solutions](https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html)
* [Java Tutorial Hello World](https://docs.oracle.com/javase/tutorial/getStarted/index.html)

## Learning Objectives
Developers will be able to:
* Understand the CodeFellows layout & space.
* Describe the format class will take each day.
* Compare and contrast, at a high level, some differences between Java and JavaScript, including typing.
* Write a class that solves a basic problem, compile it, and run it.

## Agenda
- Welcome, introductions
- Overview of Slack, Canvas, GitHub
- Review of Git workflow
- Lab intro

## Our Git Workflow

English description:
- Create the repo (maybe on GitHub)
- Use clone link to run `git clone`
- MAKE SURE MASTER HAS AN INITIAL COMMIT
  - .gitignore file
- Check out a branch (separate your features! keep master clean!)
- write some code :D
- `add, commit` (still in the feature branch)
  - have a good commit message
- `push` to the feature branch on GitHub
- Make a pull request on GitHub to your master branch
  - get feedback, fix stuff
- Merge the pull request
- `git checkout master`
- `git pull` on your master branch locally
- go back to "Check out a branch" and repeat forever

## Git and GitHub Warmup
1. Draw a diagram of how git and GitHub work. Include your computer and GitHub (in the cloud), each of which has both a master branch and a feature branch. Include arrows for how the code moves when performing each of these actions:
  - add
  - commit
  - push
  - clone
  - pull
  - pull request
  - checkout
2. Write an English description of your Git workflow: when you start working, what do you do? Where do you do your work, and what do you do as you're working and when you've finished your work for the day?

## Java Warmup
1. Write down the things that feel the most different between JavaScript and Java based on your experience with the prework.
2. What data types do we have in Java?
3. What happens when we write bad code in JavaScript? What about in Java?

### Topics

* Introduction to the most basic Java toolchain: text editor/IDE and compiler
* basics of variables, classes/objects
* exceptions

### Lecture Code
Write the following `HelloWorld` code:

```Java
public class HelloWorld {
  public static void main(String[] args){
    System.out.println("Hello World");
  }
}
```

Save the file and go back to the command-line and enter the following commands:

```
javac HelloWorld.java
java HelloWorld
```

> You should see `Hello World` print out to the command line.

What just happened? Let's discuss. (Also run `ls` to see what's changed in the current directory.)

### Variables and Constants
* In `HelloWorld.java` change the above code to the following:
```Java
public class HelloWorld {
  public static void main(String[] args){
    // System.out.println("Hello World");

    String firstName = "Arthur";
    String lastName = "Pendragon";
    Integer age = 20;

    System.out.println("Name: " + firstName + " " + lastName + " - Age: " + age);

  }
}
```

### Making Decisions
Below the above code, we'll add in:

```java
if (name.contains("Arthur")) {
  System.out.println("Your name is Arthur!");
} else if (name == "Bob") {
  System.out.println("Your name is Bob!");
} else {
  System.out.println("I dont know your name...");
}

String favoriteLanguage = firstName == "Arthur" ? "Swift" : "Not Sure";

System.out.println(favoriteLanguage);
```


### Methods
Implement the following functions in the HelloWorld class:
```java
public static String printFullName(String firstName, String lastName){
  String fullName = firstName + " " + lastName;
  System.out.println(fullName); //Output: "Arthur Pendragon"
  return fullName;
}

public static void helloWorld(){
  System.out.println("HELLO WORLD!!");
}
```

Then, call in the `main()` function:
```java
public static void main(String[] args){
  // System.out.println("Hello World");
  String firstName = "Arthur";
  String lastName = "Pendragon";
  Integer age = 31;

  HelloWorld.helloWorld(); //call method with no arguments or return.

  HelloWorld.printFullName(firstName, lastName); //Show this
  printFullName(firstName, lastName); //Change to this to show omitting the class name when calling static methods inside other static methods of the same class.

  System.out.println(Math.abs(-100)); // 100
  System.out.println(Math.min(-100, 100)); // -100
  System.out.println(Math.max(-100, 100));// 100

}
```

### Exceptions

When our code would do something illegal as it runs, we instead get a runtime exception.
```java
  String name = "Arthur";
  System.out.println(name.charAt(10));
  // causes a java.lang.StringIndexOutOfBoundsException
  ```

### Basic Loops
In Java, we create arrays with a fixed size, and then we can loop through them with a basic for loop.
```java
String[] names = ["Alice", "Bob", "Carol"];
for (int i = 0; i < names.length; i++) {
  System.out.println(names[i]);
}
// we can also overwrite the thing at an index
for (int i = 0; i < names.length; i++) {
  names[i] = "Hello, " + names[i] + "!";
  System.out.println(names[i]);
}
