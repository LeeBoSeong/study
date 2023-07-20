package study01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lotto2 {
	public static void main(String[] args) {
		//indexOf를 이용하여 중복 검사(indexOf는 배열에선 사용 불가)
		Random random = new Random();
		List<Integer> lNum = new ArrayList<Integer>();
		
		for(int i = 0; i < lNum.size(); i++) {
			int r = random.nextInt(6)+1;
			if(lNum.indexOf(r) == -1) {
				lNum.add(r);
			}else {
				--i;
			}
		}
	}
}
