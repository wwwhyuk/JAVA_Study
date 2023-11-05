package ArrayListTest;

import java.util.ArrayList;

public class Student {
	private int stuCode;
	private String stuName;
	ArrayList<Subject> SubjectList;
	
	public Student(int stuCode, String stuName) {
		this.stuCode = stuCode;
		this.stuName = stuName;
		SubjectList = new ArrayList<>();
	}
	
	public void createScore(String name, int score) {
		Subject subject = new Subject(name, score);
		SubjectList.add(subject);
	}
	
	public void StudentInfo() {
		int total = 0;
		for(Subject s : SubjectList) {
			System.out.println(stuName+" "+stuCode);
			System.out.println(s.getName()+"의 점수는"+s.getScore());
			total+=s.getScore();
		}
		System.out.println("총점은" +total);
	}
}
