package array;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student(100, "뚤리");
		Student student2 = new Student(101, "또치");
		Student student3 = new Student(102, "또우너");
		
		students.remove(0);
		students.add(student2);
		students.add(student3);
		
		for(int i = 0; i < 3; i++) {
			Student getStudent = students.get(i);
			getStudent.showInfo();
		}
		
		
	}

}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("이름과 학번은 " + name + ", " +  id + " 입니다");
	}
}