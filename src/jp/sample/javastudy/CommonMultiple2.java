package jp.sample.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i < 50) {
			if((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}
	}

}
