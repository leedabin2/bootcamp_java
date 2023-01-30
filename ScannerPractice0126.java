package edu.inha.Scanner;

import java.util.Scanner;

public class ScannerPractice0126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요!!");
		String name = sc.nextLine();
		//String name = sc.nextLine();
		
		
		System.out.printf("학과명을 입력하세요!!");
		String major = sc.nextLine();
		
		System.out.printf("영어 점수 입력:");
		int eng = sc.nextInt();
		
		System.out.printf("물리학 점수 입력:");
		int phy = sc.nextInt();
		
		System.out.printf("미적분학 점수 입력:");
		int cal = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("주소를 입력하세요!!");
		String adress = sc.nextLine();
		
		System.out.printf("이름 = %s, 학과명 = %s\n",name,major);
		System.out.printf("영어 = %d, 물리학 = %d, 미적분학 = %d\n",eng,phy,cal);
		
		int sum = eng + phy + cal;
		float avg = (float)(sum/3.0);
		
				
		System.out.printf("총점 = %d, 평균 = %.2f\n",sum,avg);
		System.out.printf("주소 = %s\n",adress);
	
		
		
		
		
		
		
		

	}

}
