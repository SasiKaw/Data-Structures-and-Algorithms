import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

class Node{
    int element;
    Node next = null;

    public Node(int element){
        this.element = element;
    }
}


class LinkedList {

    Node head;

    public LinkedList(){
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

    public List<Node> getAllNodes(){
        List<Node> nodes = new ArrayList<>();
        Node current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }
        return nodes;
    }


}

public class LinkedListVisualizer extends JPanel {
    private LinkedList linkedList;

    public LinkedListVisualizer(LinkedList linkedList){
        this.linkedList = linkedList;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        List<Node> nodes = linkedList.getAllNodes();
        int x = 50;
        int y = 50;

        if(!nodes.isEmpty()){
            g.drawString("Head", x - 30, y + 20);
            g.drawLine(x - 40, y + 15, x - 10, y + 15);
            g.drawLine(x - 15, y + 10, x - 10, y + 15);
            g.drawLine(x - 15, y + 20, x - 10, y + 15);

        }

        for(Node node : nodes){
            g.drawRect(x, y, 50, 30);
            g.drawString(String.valueOf(node.element), x + 20, y + 20);
            if(node.next != null){
                g.drawLine(x + 50, y + 15, x + 70, y + 15);
                g.drawLine(x + 65, y + 10, x + 70, y + 15);
                g.drawLine(x + 65, y + 20, x + 70, y + 15);

            }
            else{
                g.drawLine(x + 50, y + 15, x + 80, y + 15);
                g.drawLine(x + 75, y + 10, x + 80, y + 15);
                g.drawLine(x + 75, y + 20, x + 80, y + 15);
                g.drawString("null", x + 60, y + 20);
            }
            x+=70;
        }
    }

    
}

class Program{
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        LinkedList link = new LinkedList();
        link.setHead(node1);
        link.linkNode(node1, node2);
        link.linkNode(node2, node3);
        
        link.addFirst(40);
        link.addLast(60);
        link.addFirst(100);

        JFrame frame = new JFrame("Linked Lisst Visualization");
        LinkedListVisualizer visualizer = new LinkedListVisualizer(link);
        frame.add(visualizer);
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

    }
}
