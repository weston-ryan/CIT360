
import com.sun.istack.internal.logging.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import threadsrunnableexecutors.RunnableExample;

/**
 *Ryan Weston - CIT360
 * Threads, Executors, and runnable
 * Melissa helped a lot on this. Plus I used the "Java Multithreading
 * With Executors Course Lectures 1-12" to create this.(https://www.youtube.com/watch?v=B037zeHUVH8)
 * I did create the extra files (Callable, Thread, Runnable, Increment, and Interrupted to make this run)
 * That was a lot of work!
 */
public class ThreadsRunnablesExecutors {
    
    // we will get the value, return that value and also increment it at the same time.
    private static IncrementCounter.Counter mainCounter;
    
public static void main(String[] args) throws InterruptedException{

   IncrementCounter.Counter counter = new IncrementCounter.Counter();
   mainCounter = counter;
   ExecutorService executor = Executors.newFixedThreadPool(2);
   
   //first it will call the callables
   Future<Integer> f1 = executor.submit(new CallableExample(6));
   Future<Integer> f2 = executor.submit(new CallableExample(11));
   Future<Integer> f3 = executor.submit(new CallableExample(15));
   
   // then it will run the "ThreadExample" which extends thread
   // this is going to grab the atomic integer and then return the answer back or
   // save the value and print it out.
   Thread t1 = new ThreadExample("Hello.");
   t1.setName("t1");
   t1.start();
   
   (new ThreadExample("how are you?")).start();
   
   // now it will run the "Runnables section
   // this will increment the automic integer
   Runnable r1 - new RunnableExample();
   new Thread(r1, "t3").start();
   new Thread(r1, "t4").start();
   (new Thread(new RunnableExample(5))).start();
   
   // now a try/catch statement
   try{
       System.out.println("f1 result: " + f1.get());
       System.out.println("f2 result: " + f2.get());
       System.out.println("f3 result: " + f3.get());
   }
   // get the futures that are floating out there and log them here.
   catch (InterruptedExeption ex){
       Logger.getLogger(ThreadsRunnablesExecutors.class.getName()).log(Level.SEVERE, null, ex);
   }
   // this will thut down the executor that was created above.
       executor.shutdown();
       try{
       if(!executor.awaitTermination(1, TimeUnit.SECONDS)){
       executor.shutdownNow();
       }
       }
       //if it catches the executor, then shut it down.
       catch (InterruptedException ex)
       {
       executor.shutdown();
       }
   }
public static IncrementCounter.Counter getMainCounter()
{
return mainCounter;
}
   }    

 /*
output
run:
11 squared is 121. Thread: pool-1-thread-21
6 squared is 36. Thread: pool-1-thread-10
15 squared is 225. Thread: pool-1-thread-22
how are you? from Thread-1. Counter: 4
Hello. from t1. Counter: 3
*/ 
