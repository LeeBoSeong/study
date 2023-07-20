package study01;

import java.util.Random;

//중복 없는 로또를 뽑고나서 작은 수 부터 정렬하기
public class Lotto_Sort {
	public static void main(String[] arg) {
		Random random = new Random();
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			int rNum = random.nextInt(100) + 1;
			nums[i] = rNum;
			for (int j = 0; j < i; j++) {
				if (nums[j] == rNum) {
					i--;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
