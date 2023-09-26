package jp.sample.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		//２と３の公倍数以外の数を表示する
		int i = 1;
		while(i < 20) {
			if(!((i % 2 == 0) && (i % 3 == 0))) {
				System.out.println(i);
			}
			i++;
		}
	}

}
