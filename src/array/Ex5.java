package array;

public class Ex5 {

	public static void main(String[] args) {
		char[] srcArr = {'a','b','c','d','e'};
		char[] copyArr = new char[3];
		
		System.arraycopy(srcArr, 1, copyArr, 0, 3);
		
		
		for(int i = 0; i < copyArr.length;i++) {
			System.out.println(copyArr[i]);
		}

	}

}
