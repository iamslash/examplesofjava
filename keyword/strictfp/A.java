// Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable.

class A {
  strictfp double compute(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    A a = new A();
    System.out.println("Hello World " + a.compute(0.5, 0.5));
  }
}
