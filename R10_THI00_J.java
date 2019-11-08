/*Rule 10. Thread APIs (THI)
THI00-J. Do not invoke Thread.run()
Compliant Code:*/
public final class R10_THI00_J implements Runnable {
  @Override public void run() {
    System.out.println("Things happening.");
  }

  public static void main(String[] args) {
    R10_THI00_J foo = new R10_THI00_J();
    new Thread(foo).start();
  }
}
