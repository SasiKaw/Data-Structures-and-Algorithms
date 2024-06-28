# Stack

This repository contains a Java implementation of a stack data structure. The stack is implemented using an array and supports basic operations such as push, pop, and getTop.

## Usage

To use the stack, follow these steps:

1. Create an instance of the `Stack` class.
2. Use the `push` method to add elements to the stack.
3. Use the `pop` method to remove elements from the stack.
4. Use the `getTop` method to retrieve the top element of the stack.

Here's an example usage:

```java
Stack s1 = new Stack();
s1.push(10);
s1.push(20);
s1.push(30);

s1.getTop(); // Output: 30

s1.pop();
s1.getTop(); // Output: 20

s1.pop();
s1.pop();
s1.getTop(); // Output: Stack is empty
```

## Customizing the Stack

You can customize the capacity of the stack by providing a capacity value when creating an instance of the `Stack` class. By default, the capacity is set to 5.

```java
Stack s2 = new Stack(10); // Create a stack with capacity of 10
```

