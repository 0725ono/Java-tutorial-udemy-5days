package jp.sample.javastudy;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		// BMI計算！
		// BMI =　体重 / (身長 * 身長)
		// 体重　kg、身長　cm	
		double weight, height, bmi;
		
		//weight = 54;
		//height = 176;
		
		System.out.println("テスト");
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？(kg) :");
		weight = stdIn.nextDouble();
		
		System.out.println("身長は？(cm) :");
		height = stdIn.nextDouble();
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		if (bmi < 18.5) { 
			System.out.println("BMI:" + bmi + "　痩せ型です。");
		} else if(bmi < 25) {
			System.out.println("BMI: " + bmi + "　標準です。");
		} else {
			System.out.println("BMI：　" + bmi + "　肥満です。");
		}
	}

}
