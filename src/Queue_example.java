import java.util.PriorityQueue;

public class Queue_example {
    public static void main(String[] args) {

        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for(int pq : myPriorityQueue) {
            System.out.println(pq);
        }

        myPriorityQueue.remove();
        System.out.println("After removing:");
        for(int i: myPriorityQueue)
            System.out.println(i);

        myPriorityQueue.add(4);
        myPriorityQueue.add(5);
        myPriorityQueue.remove(4);
        System.out.println("After removing from middle:");
        for(int i: myPriorityQueue)
            System.out.println(i);
        System.out.println("Show top of queue:");
        System.out.println(myPriorityQueue.peek());
    }
}
