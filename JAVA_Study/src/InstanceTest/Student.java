package InstanceTest;

public class Student {
	private int stuCode;
	private String stuName;
	Subject subject;
	
	public Student(int stuCode, String stuName) {
		this.stuCode = stuCode;
		this.stuName = stuName;
		subject = new Subject();
	}
	
	public void createScore(String name, int score) {
		subject.setName(name);
		subject.setScore(score);	
	}
	
	public void StudentInfo() {
		System.out.println("학생명은 " + this.stuName + "학번은 " + this.stuCode);
		System.out.println("과목명은 " + subject.getName()+"성적은 "+subject.getScore()+"\n");
	}
}
