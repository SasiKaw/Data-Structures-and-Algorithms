

class Node{
    int element;
    Node next = null;

    public Node(int element){
        this.element = element;
    }
}


class linkedList {

    Node head;

    public linkedList(){
        this.head = null;
    }

    public void linkNode(Node preNode, Node newNode){
        preNode.next = newNode;
    }

    public void setHead(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    public void addFirst(int element){
        Node newNode = new Node(element);

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int element){
        Node newNode = new Node(element);

        Node tempNode = head;

        while (true) {
            if(tempNode.next.next != null){
                tempNode = tempNode.next;
            }
            else{
                newNode.next = tempNode.next.next;
                tempNode.next.next = newNode;
                break;
            }
        }
    }

    public void printList(){
        Node currentNode = head;

        while(true){
            if(currentNode.next != null){
                System.out.print(currentNode.element + "->");
                currentNode = currentNode.next;
            }
            else{
                System.out.print(currentNode.element);
                break;
            }
        }
    }
}

class Program{
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        linkedList link = new linkedList();
        link.setHead(node1);
        link.linkNode(node1, node2);
        link.linkNode(node2, node3);
        
        link.addFirst(40);
        link.addLast(60);
        
        link.printList();
        
        

    }
}
