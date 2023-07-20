package study01;

import java.util.Random;

public class Lotto {
	//기초적인 배열과 이중for문을 이용한 방법
	public static void main(String[] args) {
		Random random = new Random();
		int[] lNum = new int[6];
		
		for(int i = 0; i < lNum.length; i++) {
			int rNum = random.nextInt(6)+1;
			lNum[i] = rNum;
			for(int j = 0; j < i; j++) {
				if(lNum[j] == rNum) {
					i--;
				}
			}
		}
		for(int i = 0; i < lNum.length; i++) {
			System.out.println(lNum[i]);
		}
	}
}
