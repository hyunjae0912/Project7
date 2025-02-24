package array;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		
		System.out.println();
		
		// 람다식 for문 (C#의 foreach문이랑 비슷)
		// 일반 for문 보다 더 간단한 문법
		// 배열을 순회하면서 요소를 하나씩 꺼내는 구조
//		for(int value : arr) {
//			System.out.print(arr[value]);
//		}
		
		// 배열 안에 있는 요소를 하나씩 순회할 때
		// 일반 for문 / 람다식 for문

	}

}
