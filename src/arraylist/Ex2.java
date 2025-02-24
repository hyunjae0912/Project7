package arraylist;
import java.util.ArrayList;

/*
 * 반복문을 이용해서 리스트의 요소 출력하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		// 기초타입을 사용하지 않고 클래스타입을 사용한다
		// int integer
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i = 0; i < 3;i++) {
			System.out.println(list.get(i));
		}
		
	}
}
