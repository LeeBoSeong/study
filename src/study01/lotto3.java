package study01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class lotto3 {
	public static void main(String[] args) {
		//contains를 이용한 중복 검사 배열은 안됌
		Random random = new Random();
		List<Integer> lNum = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			int r = random.nextInt(6)+1;
			if(!lNum.contains(r)) {
				lNum.add(r);
			}else {
				i--;
			}
		}
		for(int i = 0; i < lNum.size(); i++) {
			System.out.println(lNum.get(i));
		}
	}
}
