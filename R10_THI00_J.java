/*Rule 10. Thread APIs (THI)
THI00-J. Do not invoke Thread.run()
Non-Compliant Code:*/
public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }

  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).run();
  }
}
