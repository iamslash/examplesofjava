// http://tutorials.jenkov.com/java-concurrency/volatile.html

// 한개의 쓰레드만 특정 변수를 읽고 쓰고 다른 쓰레드는 앞서 언급한
// 변수를 읽기만 한다면 최신 데이터를 보장하기 위해 성능상의 이유로
// syncronized보다 volatile을 사용한다.
// volatile이 선언된 변수는 CPU CACHE대신 main memory에 읽고 쓴다.

// Why use it???
//
// only one thread reads and writes the value of a volatile variable
// and other threads only read the variable, then the reading threads
// are guaranteed to see the latest value written to the volatile
// variable. Without making the variable volatile, this would not be
// guaranteed.

public class A extends Thread {
  // private volatile boolean close = false;
  private boolean close = false;
  public void run() {
    int n = 0;
    while(!close) {
      // do work
      try {
        Thread.sleep(1000);
        System.out.println("Hello World " + n++);
      }
      catch (Throwable e) {
        // System.out.println("Error " + e.getMessage());
        // e.printStackTrace();
      }
    }
  }
  public void close() {
    close = true;
    // interrupt here if needed
  }

  public static void main(String[] args) {
    
    A a = new A();

    try {
      a.start();
      Thread.sleep(10000);
    }
    catch (Throwable e) {
      System.out.println("Error " + e.getMessage());
      e.printStackTrace();
    }
    finally {
      a.close();      
    }
  }
}
