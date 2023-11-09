package AbstractTest;

public class AbstractTest {

	public static void main(String[] args) {
		Computer c1 = new MyNotebook();
		Computer c2 = new Desktop();
		//abstract class can't be instantiate.
		
		c1.display();
		c1.typing();
		c1.turnOn();
		c1.turnOff();
		
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
	}
}
