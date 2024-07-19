package BinarySearchTreeApplication;

import java.util.NoSuchElementException;;

class BSTNode{
    int value;
    BSTNode leftChild;
    BSTNode rightChild;

    public BSTNode(int value){
        this.value = value;
    }

}

class BSTree{
    BSTNode root;

    BSTNode insert(int value, BSTNode node){
        if(node == null){
            node = new BSTNode(value);
        }

        else if (node.value > value) {
            node.leftChild = insert(value, node.leftChild);
        }

        else if(node.value < value){
            node.rightChild = insert(value, node.rightChild);
        }
        else{
            throw new IllegalArgumentException("Value already in BST");
        }
        return node;
    }

    void insert(int value){
        root = insert(value, root);
    }

    void preOrderTraversal(BSTNode node){
        if(node != null){
            System.out.print(node.value + ", ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    void postOrderTraversal(BSTNode node){
        if (node != null) {  
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.print(node.value + ", ");
        }
    }

    void inOrderTraversal(BSTNode node){
        if (node != null) {
            postOrderTraversal(node.leftChild);
            System.out.println(node.value + ", ");
            postOrderTraversal(node.rightChild);
        }
    }

    void traversal(String order){
        System.out.print(order + "order:[");
        if (order == "Pre") {
            preOrderTraversal(root);
        }
        else if(order == "Post"){
            postOrderTraversal(root);
        }
        else if(order == "In"){
            inOrderTraversal(root);
        }
        else{
            throw new IllegalArgumentException("Order should Pre, Post or In");
        }
        System.out.println("]");
    }

    BSTNode search(int value, BSTNode node){
        if(node == null){
            throw new NoSuchElementException(value + " is not available");
        }

        else if(node.value == value){
            return node;
        }
        else if(node.value > value){
            return search(value, node.leftChild);
        }
        else{
            return search(value, node.rightChild);
        }
    }

    BSTNode search(int value){
        return search(value, root);
    }

    BSTNode leftRotate(BSTNode node){
        BSTNode rightChild = node.rightChild;
        node.rightChild = rightChild.leftChild;
        rightChild.leftChild = node;
        return rightChild;

    }

    BSTNode rightRotate(BSTNode node){
        BSTNode leftChild = node.leftChild;
        node.leftChild = leftChild.rightChild;
        leftChild.rightChild = node;
        return leftChild;
    }
}


class BSTApplication {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(40);
        bst.traversal("Post");

        bst.insert(50);
        System.out.println("Inserted 50");
		bst.traversal("Pre");
		System.out.println("Tree is unbalanced to rightChild - Straight leg detected.");
		bst.search(20).rightChild = bst.leftRotate(bst.search(30));
		System.out.println("Rotated 30 leftChild");
		bst.traversal("Pre");
		System.out.println("Tree is balanced");

		bst.insert(25);
		bst.insert(28);
		System.out.println("Inserted 25 and 28");
		bst.traversal("Pre");
		System.out.println("Tree is unbalanced to leftChild - Dog leg detected.");
		bst.search(30).leftChild = bst.leftRotate(bst.search(25));
		System.out.println("Rotated around 25 anticlockwise");
		bst.traversal("Pre");
		System.out.println("Rotated around 30 clockwise");
		bst.search(40).leftChild = bst.rightRotate(bst.search(30));
		bst.traversal("Pre");
		System.out.println("Tree is balanced.");

    }
}
