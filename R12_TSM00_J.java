/*Rule 12. Thread-Safety Management (TSM)
TSM00-J. Do not override thread-safe methods with methods that are not thread-safe
Compliant Code:*/
class R12_TSM00_J {
  public synchronized void doSomething() {
    System.out.println("Things going on.");
  }

  public static void main(String [] args){
    
  }
}

class Derived extends R12_TSM00_J {
  @Override public synchronized void doSomething() {
    System.out.println("Things also happening.");
  }
}
