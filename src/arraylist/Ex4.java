package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		Student student = new Student("둘리");
		
		student.subjectlist.add(new Subject("수학", 100));
		student.subjectlist.add(new Subject("국어", 50));
		
		student.showInfo();
		
		
		// 1. 인스턴스 생성 > 참조변수 입력
		// 2. 바로 인스턴스 생성
		Student student2 = new Student("도우너");
		student2.subjectlist.add(new Subject("국어", 80));
		student2.subjectlist.add(new Subject("수학", 100));
		student2.subjectlist.add(new Subject("물리", 50));
		student2.subjectlist.add(new Subject("영어", 70));
		
		student2.showInfo();
		
	}
}


class Subject {
	String name;
	int score;
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}


class Student {
	String studentName;	// name
	ArrayList<Subject> subjectlist; // subject list 리스트 선언
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		
		subjectlist  = new ArrayList<Subject>();	// 초기화
		
	}
	
	public void showInfo() {
		int total = 0;
		// size = array.length
		for(int i = 0; i < subjectlist.size(); i++) {
			Subject subject = subjectlist.get(i);
			int subscore = subject.score;
			total += subscore;
		}
		
//		
//		for(Subject subject : subjectlist) {
//			total += subject.score;
//		}
		
		System.out.println(studentName + "의 총 과목의 합은 " + total + "점 입니다.");
	}
}









