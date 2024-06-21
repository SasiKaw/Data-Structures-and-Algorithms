# Linked List Data Structure

This is a simple implementation of a linked list data structure in Java.

## Overview

A linked list is a data structure that consists of a sequence of nodes, where each node contains an element and a reference to the next node in the sequence. The linked list starts with a head node, which is the entry point to the list.

## Classes

### Node

The `Node` class represents a single node in the linked list. It has the following properties:

- `element`: The element stored in the node.
- `next`: A reference to the next node in the list.

### LinkedList

The `LinkedList` class represents the linked list itself. It has the following methods:

- `linkNode(Node preNode, Node newNode)`: Links a new node after a given node.
- `setHead(Node newNode)`: Sets the head of the linked list to a new node.
- `addFirst(int element)`: Adds a new node with the specified element at the beginning of the list.
- `addLast(int element)`: Adds a new node with the specified element at the end of the list.

## Usage

To use the linked list, you can create an instance of the `LinkedList` class and perform operations on it. Here's an example:

