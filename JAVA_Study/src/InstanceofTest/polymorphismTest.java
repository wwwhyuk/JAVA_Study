package InstanceofTest;

import java.util.ArrayList;

public class polymorphismTest {
	public static void main(String args[]) {
		
		Animal h1 = new Human();
		Animal t1 = new Tiger();
		Animal e1 = new Eagle();
		
		Animal a1 = new Eagle();
		if (a1 instanceof Eagle) {
		    Eagle e2 = (Eagle)a1;
		    e2.crying();
		    e2.move();
		} else {
		    System.out.println("a1 is not an instance of Eagle");
		}
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(h1);
		animalList.add(t1);
		animalList.add(e1);
		
		for(Animal a : animalList) {
			a.move();
		}
		
		polymorphismTest test = new polymorphismTest();
		test.downcastingTest(animalList);
	
	}
	public void downcastingTest(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			if(list.get(i) instanceof Human) {
				Human human = (Human)animal;
				human.read();
			}
			if(list.get(i) instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.crying();
			}
			if(list.get(i) instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.crying();
			}
		}
	}
}
