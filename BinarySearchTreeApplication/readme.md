# Binary Search Tree Application

This is a Java application that demonstrates the implementation and usage of a Binary Search Tree (BST). A BST is a data structure that allows efficient searching, insertion, and deletion of elements.

## BSTNode Class

The `BSTNode` class represents a node in the BST. It has the following properties:

- `value`: The value stored in the node.
- `leftChild`: The left child of the node.
- `rightChild`: The right child of the node.

## BSTree Class

The `BSTree` class represents the BST itself. It has the following methods:

- `insert(int value)`: Inserts a new node with the given value into the BST.
- `preOrderTraversal(BSTNode node)`: Performs a pre-order traversal of the BST starting from the given node.
- `postOrderTraversal(BSTNode node)`: Performs a post-order traversal of the BST starting from the given node.
- `inOrderTraversal(BSTNode node)`: Performs an in-order traversal of the BST starting from the given node.
- `traversal(String order)`: Performs a traversal of the BST in the specified order ("Pre", "Post", or "In").
- `search(int value)`: Searches for a node with the given value in the BST.
- `leftRotate(BSTNode node)`: Performs a left rotation on the given node.
- `rightRotate(BSTNode node)`: Performs a right rotation on the given node.

## BSTApplication Class

The `BSTApplication` class contains the `main` method, which demonstrates the usage of the BST. It creates a BST, inserts some values, performs traversals, and demonstrates rotation operations.

To run the application, compile and execute the `BSTApplication` class.
