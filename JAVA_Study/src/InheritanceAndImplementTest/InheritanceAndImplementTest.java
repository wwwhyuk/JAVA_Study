package InheritanceAndImplementTest;

public class InheritanceAndImplementTest {

	public static void main(String[] args) {
		Interface mc = new MyClass();
		mc.enQueue("first");
		mc.enQueue("second");
		mc.enQueue("third");
		mc.enQueue("fourth");
		mc.enQueue("fifth");
		
		System.out.println(mc.getSize());
		System.out.println(mc.deQueue());
		System.out.println(mc.deQueue());
		System.out.println(mc.deQueue());
		System.out.println(mc.deQueue());
		System.out.println(mc.deQueue());
	}

}
