package Stack;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Stack {
    int top = -1;
    int capacity = 0;
    int stackArray[];
    
    public Stack(){
        this.capacity = 5;
        stackArray = new int[capacity];
    }

    public Stack(int capacity){
        this.capacity = capacity;
        stackArray = new int[capacity];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == capacity-1){
            return true;
        }
        return false;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            top+=1;
            stackArray[top] = num;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top-=1;
        }
    }

    public int getTop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            //System.out.println(stackArray[top]);
            return stackArray[top];
        }
        return 0;
        
    }


}


class StackVisualizer extends JFrame {
    
    private static final int STACK_SIZE = 30;
    private static final int RECTANGLE_HEIGHT = 50;
    private static final int RECTANGLE_WIDTH = 100;
    private ArrayList<Rectangle> stackVisual = new ArrayList<>();
    private int top = -1;
    private JLabel topLabel = new JLabel("Top: None");
    private Stack stack;
    private JPanel stackPanel;
    private JScrollPane scrollPane;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackVisualizer app = new StackVisualizer();
            app.setVisible(true);
        });
    }
    
    public StackVisualizer() {
        stack = new Stack(STACK_SIZE);
        
        setTitle("Stack Visualizer");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout());
        rootPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");
        JTextField inputField = new JTextField(10);
        inputField.setMaximumSize(new Dimension(Integer.MAX_VALUE, inputField.getPreferredSize().height));
        inputField.setToolTipText("Enter value to push");

        pushButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, pushButton.getPreferredSize().height));
        popButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, popButton.getPreferredSize().height));

        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    push(value);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StackVisualizer.this, "Please enter a valid integer.");
                }
            }
        });
        
        popButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pop();
            }
        });
        
        controlPanel.add(inputField);
        controlPanel.add(pushButton);
        controlPanel.add(popButton);
        
        topLabel.setFont(new Font("Serif", Font.BOLD, 20));
        topLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rootPanel.add(topLabel, BorderLayout.NORTH);

        stackPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i <= top; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(50, getHeight() - (i + 1) * RECTANGLE_HEIGHT - 10, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
                    g.setColor(Color.BLACK);
                    g.drawRect(50, getHeight() - (i + 1) * RECTANGLE_HEIGHT - 10, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
                    g.drawString(String.valueOf(stack.stackArray[i]), 95, getHeight() - (i + 1) * RECTANGLE_HEIGHT + 20);
                }
            }
        };
        stackPanel.setPreferredSize(new Dimension(200, STACK_SIZE * RECTANGLE_HEIGHT + 20));
        stackPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        scrollPane = new JScrollPane(stackPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(200, 500));

        rootPanel.add(controlPanel, BorderLayout.EAST);
        rootPanel.add(scrollPane, BorderLayout.CENTER);

        add(rootPanel);
    }
    
    private void push(int num) {
        if (stack.isFull()) {
            JOptionPane.showMessageDialog(this, "Stack is full");
        } else {
            stack.push(num);
            top++;
            int topValue = stack.getTop();
            topLabel.setText("Top: " + topValue);
            repaint();
            revalidate();
        }
    }
    
    private void pop() {
        if (stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stack is empty");
        } else {
            stack.pop();
            top--;
            topLabel.setText(top >= 0 ? "Top: " + stack.getTop() : "Top: None");
            repaint();
            revalidate();
        }
    }
}



