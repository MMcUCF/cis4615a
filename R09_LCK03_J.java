/*Rule 09. Locking (LCK)
LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects.
Compliant Code:*/
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class R09_LCK03_J{
  private final Lock lock = new ReentrantLock();

 public static void main(String [] args){
   doSomething();
 }

public static void doSomething() {
    lock.lock();
    try {
      System.out.println("Working on thread.");
    } finally {
      lock.unlock();
    }
  }
}

