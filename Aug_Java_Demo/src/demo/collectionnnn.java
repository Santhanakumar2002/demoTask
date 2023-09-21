package demo;

import java.util.ArrayList;
import java.util.Collections;

public class collectionnnn {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(23);
		num.add(16);
		num.add(236);
		num.add(60);
		Collections.sort(num);
		num.remove(3);
		for(int i: num) {
			System.out.println(i);
		}
	}

}
