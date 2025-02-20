
package array;

/*
 * 반복문을 사용하여 배열의 요소를 하나씩 출력하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		System.out.println(intArr[5]);
		System.out.println(intArr[6]);
		System.out.println(intArr[7]);
		System.out.println(intArr[8]);
		System.out.println(intArr[9]);
		
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(intArr[i]);
		}

		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}
// 으후루꾸꾸루후으으후루꾸꾸루후으으후루꾸꾸루후으으후루꾸꾸루후으으후루꾸꾸루후으으후루꾸꾸루후으으후루꾸꾸루후으
		
		System.out.println("배열의 크기" + intArr.length);
		
		
		// 배열을 사용한다고 할 때 length 를 사용하는게 유지보수에 좋다.
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}
}
