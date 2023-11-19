package InheritanceAndImplementTest;

public class MyClass extends Class implements Interface {

	@Override
	public void enQueue(String name) {
		queueList.add(name);
	}

	@Override
	public String deQueue() {
		return queueList.remove(0);
	}

	@Override
	public int getSize() {
		return queueList.size();
	}
}
