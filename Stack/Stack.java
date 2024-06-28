package Stack;

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

    public void getTop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stackArray[top]);
        }
        
    }


}

class Program{
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        s1.getTop();
        s1.pop();
        s1.getTop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.getTop();
        
    }
}
