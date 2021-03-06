/* 
 *Ryan Weston
 *CIT 360
 */
 
import java.util.GroupList;
import java.util.Queue;

public class GroupList {
    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> waitingQueue = new GroupList<>();

        // Adding new group members(elements) to the Queue (The Enqueue operation)
        waitingQueue.add("Tammy");
        waitingQueue.add("Stefano");
        waitingQueue.add("Rebecca");
        waitingQueue.add("Andrea");
        waitingQueue.add("Ryan");
        waitingQueue.add("Chris");
        waitingQueue.add("Oscar");
        waitingQueue.add("Denise");

        System.out.println("WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);
    }
}
