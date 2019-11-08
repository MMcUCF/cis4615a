/*Rule 09. Locking (LCK)
LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects.
Non-Compliant Code:*/
private final Lock lock = new ReentrantLock();

public void doSomething() {
  synchronized(lock) {
    // ...
  }
}
