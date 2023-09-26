package jp.sample.javastudy;

public class calc2 {

	public static void main(String[] args) {
		// BMI計算！
		// BMI =　体重 / (身長 * 身長)
		// 体重　kg、身長　cm	
		double weight, height, bmi;
		
		weight = 54;
		height = 176;
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
	}

}
