package Demo;
class A{
	public void testA(String name)
	{
		System.out.println(name + " From class A");
	}
}
class B extends A{
	public void testA(String name)
	{
		System.out.println(name + " From class B");
	}
}
public class MethodOverridding {
	public static void main(String[] args) {
		A obj = new B();
		B obj1 = (B)obj;
		obj1.testA("TYSS");
	}
}
