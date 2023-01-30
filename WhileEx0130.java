package edu.whileEx;

public class WhileEx0130 {

	public static void main(String[] args) {
		int i = 0 ;  
		while(i <= 7) { //조건식이 참일 때 반복 실행문
			System.out.printf("i=%d\n",i);
			++i;
		}
		//while(true)  
			//System.out.println("while 무한반복");
		
		int k = 0 ;  //while이 처음 거짓이어도 do는 최소한 한 번은 실행됨
		do {
			System.out.printf("k=%d\n",k); //do 먼저 실행 후 while 조건비교(참일 때 do 실행문)
			++k;
		} while(k <= 7);
				
				
	}

}
