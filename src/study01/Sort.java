package study01;

public class Sort {
	public static void main(String[] args) {
		//가장 작은 수 부터 차례대로 정렬하기
		int[] number = new int[] {9,4,10,2,3,16};
		for(int i = 0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				if(number[i] < number[j]) {
					int tmp = number[i];
					number[i] = number[j];
					number[j] = tmp;
				}
			}
		}
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
