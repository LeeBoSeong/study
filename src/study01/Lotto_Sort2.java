package study01;

import java.util.Random;

//중복 없는 로또를 작은 순서대로 뽑기

public class Lotto_Sort2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			int rNum = random.nextInt(6) + 1;
			nums[i] = rNum;
			for (int j = 0; j < i; j++) {
				if (nums[j] == rNum ) {
					if (nums[j] > rNum) {
						int tmp = nums[j];
						nums[j]= rNum;
						nums[i] = tmp;
						i--;
					}
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
