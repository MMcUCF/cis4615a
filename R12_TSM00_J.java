/*Rule 12. Thread-Safety Management (TSM)
TSM00-J. Do not override thread-safe methods with methods that are not thread-safe
Non-Compliant Code:*/
class Base {
  public synchronized void doSomething() {
    // ...
  }
}

class Derived extends Base {
  @Override public void doSomething() {
    // ...
  }
}
