package PolymorphismTest;

public class polymorphismTest {
	public static void main(String args[]) {
		Human h1 = new Human();
		h1.move();
		
		Animal a1 = new Animal();
		a1.move();
		
		Animal human = new Human();
		human.move();
		((Animal)((Human) human)).move();//다운캐스팅 (Human 단위로 형변환)
	}
}
