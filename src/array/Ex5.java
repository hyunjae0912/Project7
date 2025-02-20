package array;

public class Ex5 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = { 10, 15, 20, 25, 30 };
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}

		System.out.println("배열의 합 : " + sum);

	}

}
