package study01;

public class MinMax {
	public static void main(String[] args) {
		//가장 작은수와 큰수 뽑기
		int[] number = new int[] {9,4,10,2,3,16};
		int max = number[0];
		int min = number[0];
		
		for(int i = 0; i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];
			}
			if(min > number[i]) {
				min = number[i];
			}
		}
		
		System.out.println("가장 큰 수: " + max);
		System.out.println("가장 작은 수: " + min);
		
	}
}
