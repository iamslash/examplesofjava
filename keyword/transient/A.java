// Java transient keyword is used in serialization. If you define any
// data member as transient, it will not be serialized.

import java.io.Serializable;

public class A implements Serializable{
	
  private static final long serialVersionUID = 4220461820168818967L;
  String name;
  transient int age;
	
  public A() {
  }
	
  public A(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
	
  @Override
  public String toString() {
    return "A [name=" + name + ", age=" + age + "]";
  }

  public static void main(String args[]) {
    A a = new A();
    System.out.println(a);
  }
	
}
