
public class FirstEx0125 {

	public static void main(String[] args) {
		int a = 5 ;
		
		System.out.println("Study");
		System.out.print("Hello JAVA\n");
		System.out.print("INHA\n");
		System.out.printf("DecimalNum=%d\n", 7);
		System.out.printf("a=%d\n" , a);
		
		//float fv = 3.14f ; //3.14f-3.14를 float type으로 인식
		float   fv = (float)3.14 ;
		double dv = 6.28 ; 
		System.out.println("fv=" + fv);
		System.out.print("fv=" + fv + "\n");  //print함수로 출력할 때
		System.out.printf("fv=%.2f\n", fv);  //printf 함수로 출력할 때(%.2f)-소수점 둘 째 자리까지 출력
		System.out.printf("fv=%07.2f\n", fv);  //7자리 확보 후 소수점 둘 째 자리(빈칸은 0으로 채움)
		System.out.printf("fv=%7.2f\n", fv);  //7자리 확보 후(오른쪽 정렬) 소수점 둘 째 자리까지 출력
		System.out.printf("fv=%-7.2f\n", fv); //왼쪽 정렬
		
		System.out.printf("dv=%.2f\n", dv);
		
		char   ch = 'A' ;
		//char  ch2 = "A" ; //java에서는 ""를 string(문자열)로 취급한다.
		System.out.printf("ch=%c\n", ch); 
		System.out.printf("ch=%d\n", (int)ch);  //ch정수로 바꿔서 %d로 출력('A'의 ascii코드가 출력됨)
		
		String   name = "gildong" ;  //name은 String이라는 클래스의 변수 
		System.out.println("name=" + name);
		System.out.print("name=" + name + "\n");
		System.out.printf("name=%s\n", name);
		
		final  double PI = 3.14 ;  //상수 고정이 됨, 수정이 불가능
		//PI = 3.14 ; //상수는 수정이 불가 
		System.out.printf("PI=%.2f\n", PI);
		
		int    s = 15 / 2 ;
		int    p = 13 % 4 ;
		System.out.printf("s=%d, p=%d\n",s,p);
		
		int m = 3 ;
		//m = m + 1 ;
		//++m ;
		m++ ;
		System.out.printf("m=%d\n", m);
		
		
		System.out.write(65);  //'A'의 ascii코드(flush기능이 없음)
		System.out.println();  //println(줄바꿈)함수를 넣어야 write함수 출력 가능
		System.out.println("in English \'hello\'");  // \' 작은 따옴표 문자 자체를 출력 
		System.out.println("in English 'hello'");
		System.out.println("in English \"hello\"");
		System.out.println("\\hello\\");  // \(역슬래시)문자 자체를 출력
		
		
		
		
		
		
	}

}
