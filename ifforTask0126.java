package edu.inha.ifforTask;

import java.util.Scanner;

public class ifforTask0126 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 ) 
			System.out.printf("윤년입니다.");
		else if (year % 400 == 0 )
			System.out.printf("윤년입니다.");
			
		else
			System.out.printf("윤년이 아닙니다");
		

	}

}
