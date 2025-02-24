package arraylist;

import java.util.ArrayList;
import java.util.ListResourceBundle;

public class Ex1 {

	public static void main(String[] args) {
		
		// 리스트타입
		// 저 꺾쇄안헤 리스트안에 저장할 데이터의 타입을 넣는다
		// ex) int  -> interger
		// 기초타입의 클래스형인 Wrapper 클래스를 사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(456);
		list.add(789);
		
		System.out.println(list);
		
		
		list.add(1, 192);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
	}
}
