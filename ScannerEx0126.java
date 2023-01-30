package edu.inha.scanner;

import java.util.Scanner;

public class ScannerEx0126 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		int age = 0 ;
		char blood = '\0';  // '\0' null 문자
		double  height = 0.0;
		String name = null;  // name = 0 과 같은 뜻 null 상수는 0
		
		
		System.out.print("나이를 입력:"); 
		age = sc.nextInt();
		System.out.printf("age=%d\n", age);
		
		sc.nextLine(); //enter문자를 삭제하기 위한 목적
			
		System.out.print("이름 입력:");
		//name = sc.next();  //name변수에 들어가는 (string)문자열의 끝에는 null이 반드시 포함되어 있음
		name = sc.nextLine();  //공백을 읽는 문자열 함수(enter는 버리고 \0 null로 바꿔서 저장됨)
		System.out.printf("name=%s\n", name); //null문자를 출력했기 때문에 '이름 입력:name='으로 실행됨
											  //nextint()-나이를 입력 후 엔터문자를 지우지 못하고 남겨둠 nextline()이 엔터를 버리고 null로 저장
		
		System.out.print("혈액형을 입력:");  
		//blood = sc.next();  //"A"를 문자열로 간주하고 next메소드로 문자열 A로 반환시킴 string을 char에 넣으려 하니 데이터가 잘려서 에러가 발생
		blood = sc.next().charAt(0);  //charAt()리스트처럼 하나의 문자를 가져올 수있음
		System.out.printf("blood=%c\n", blood);
		
		System.out.print("키값 입력:");
		height = sc.nextDouble();
		System.out.printf("height=%.2f\n", height);
		
				
	}

}
