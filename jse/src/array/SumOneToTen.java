package array;

public class SumOneToTen {
	public static void main(String[] args) {
		
		int[] a = new int[11];
		int b = 1;
		/*a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;*/
		//int[] a = {10,2,3,4,5,6,7,8,9,1};
			
		/*for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}*/
		for (int i : a) {  // 확장된 for loop 배열 출력시 사용
			a[i] = i;
			//sum += i;
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	
	}
}
