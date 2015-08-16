package DynamicBinding;

class A 
{
  public void doIt(){
    System.out.println("In doIt of A");
  }
}

class B extends A
{
  public void doIt(){
	  System.out.println("In doIt of B");
  }
}

class C extends B
{
  public void doIt(){
	 System.out.println("In doIt of C");
  }
}

public class DB {
	
	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		C c = new C();
		A a = new B();
	    a.doIt();
	}

}
