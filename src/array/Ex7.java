package array;

public class Ex7 {

	public static void main(String[] args) {
		int [][]arr = { {2,4,6} , {3,6,9}};
		 for(int i = 0; i < 2; i ++) {
			 for(int j = 0; j < 3; j ++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 
			for(int i=0; i<arr.length; i++){ //행
				for(int j=0; j<arr[i].length; j++){ //열
					System.out.print("["+i+","+j+"] ");
				}
				System.out.println();
			}
		 
	}
}