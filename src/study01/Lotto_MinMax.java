package study01;

import java.util.Random;
//중복 없이 로또 번호를 뽑고 그중에서 가장 큰 값과 작은 값을 출력
public class Lotto_MinMax {
	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[6];
		
		for(int i = 0; i < nums.length; i++) {
			int rNum = random.nextInt(100)+1;
			nums[i] = rNum;
			for(int j = 0; j < i; j++) {
				if(nums[j] == rNum) {
					i--;
				}
			}
		}
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("가장 큰값 : "+max);
		System.out.println("가장 작은값 : "+min);
	}
}
