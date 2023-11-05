package ArrayListTest;

public class ArrayTest {

	public static void main(String[] args) {
		Student stu1 = new Student(1234,"lee");
		stu1.createScore("math", 100);
		stu1.createScore("eng", 80);
		stu1.createScore("kor", 100);
		stu1.StudentInfo();
		
		System.out.println("\n\n");
		
		Student stu2 = new Student(1222,"kim");
		stu2.createScore("math", 100);
		stu2.createScore("eng", 100);
		stu2.createScore("kor", 100);
		stu2.createScore("his", 90);
		stu2.createScore("sci", 80);
		stu2.createScore("ita", 100);
		stu2.StudentInfo();
	}

}
