package Queue;

import java.util.ArrayList;

public class QueueUsingArrayList<T>{

    ArrayList<T> arrayList;

    public QueueUsingArrayList(){
        arrayList = new ArrayList<>();
    }

    public void enqueue(T value){
        arrayList.add(value);
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return arrayList.remove(0);
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public T front(){
        return arrayList.get(0);
    }

}

class Programme{
    public static void main(String[] args) {
        QueueUsingArrayList<Integer> q1 = new QueueUsingArrayList<>();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        System.out.println(q1.front());

        System.out.println(q1.dequeue() + " from the queue");

        System.out.println(q1.front());

        System.out.println(q1.dequeue() + " from the queue");

        System.out.println(q1.front());

        System.out.println(q1.dequeue() + " from the queue");

        System.out.println(q1.dequeue() + " from the queue");

        
    }
}