
public class OperatorEx {

	public static void main(String[] args) {
		int a = 1;
		System.out.printf("a=%d\n", a);
		a = a + 1;
		System.out.printf("a=%d\n", a);
		++a;  //a = a + 1;
		System.out.printf("++a후 a=%d\n", a);
		a++;
		System.out.printf("a++후 a=%d\n", a);
		// 여기까지 한 후 a값은 4
		System.out.printf("++a후 a=%d\n", ++a);  //a값을 먼저 증가시킨 뒤 출력
		System.out.printf("a++후 a=%d\n", a++);  //현재 a값을 먼저 출력
		System.out.printf("최종 a=%d\n", a);  //출력된 a값을 증가
		
		int  b = 9;
		System.out.printf("b=%d\n", b);
		b = b - 1;
		System.out.printf("b=%d\n", b);
		--b;  //b = b - 1 ;
		System.out.printf("--b한 후 b=%d\n", b);
		b--;
		System.out.printf("b--한 후 b=%d\n", b);
		
		int  c = 8 , d = 7;  //삼항연산자, 조건연산자
		int  max = (c > d)? c : d;  // (조건식)이 참일 때 c값이 출력되어 max의 변수에 들어감
									// (조건식)이 거짓일 때 d값이 출력되어 max의 변수에 들어감
		System.out.printf("max=%d\n", max);

	}

}
