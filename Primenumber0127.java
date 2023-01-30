package edu.prime;

import java.util.Scanner;

public class Primenumber0127 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.printf("소수구하기 프로그램\n");
		System.out.printf("소수를 구할 정수 한 개 입력:");
		int num = sc.nextInt();
		int  a = 0;
		boolean isprime = true;
		
		
		for (int i = 1 ; i <= num ; i++) {
			int count = 0 ;
			for(int k = 1; k <= i ; k++) {
				if(i % k ==0) {
					isprime = false;
					count++;
					
				}
			}
			if (count == 2) {
				System.out.printf("%d(은)는 소수이다.\n", i);
				a++;
				isprime = true;}
			}
		System.out.printf("1~%d의 사이의 소수 개수=%d", num, a);
		}
	
}		


		