package edu.oopfirst;

import java.util.Scanner;

class Person
{
	private String name = null ;  //필수구성요소(멤버변수/상수)
	private int age = 0 ;  //접근권한지정자(private) person클래스 안에 있는 멤버만 사용이 가능
							//private하려는 속성을 캡슐화로 불림 2)information hiding(data)
														// 1)class person {} <묶어 둔 것 
	public Person()  //기본생성자(매개변수가 없음) 함수, 생성자함수 앞에는 반환타입을ex)void 명시하면 안 됨
	{
		System.out.println("난 Person 기본생성자");
	}
	public Person(String pname,int page)
	{
		System.out.println("난 매개변수 두 개인 Person 생성자");
		name = pname;  //hodong객체 name
		age = page;  
	}
	public void setAge(int page)
	{
		age = page;
	}
	public int getAge()  //멤버변수 age의 값을 외부로 return
	{
		return age ;
	}
	public void setName(String pname)  //(private name에 간접적으로 접근하기 위해)
	{
		name = pname ;
	}
	public String getName()  //name 외부변수의 값을 외부로 return
	{
		return name ;
	}
	
	public void talk()  //고유한 행위(method) 반환하는 값을 입력(void)
						//public - 행위를 공개, 메서드는 public을 붙임
	{	name = "아무개";
		System.out.println("talk()메서드이다.");
	}
	public void breathe()
	{
		age = 1;
	}
}
public class OOPOne0130 {

	public static void main(String[] args) {
		
		//int val[] = new int[] {10,20,30};
		int val[] = new int[3] ;
		val[0] = 10 ; val[1] = 20; val[2] = 30;
		
		for(int i = 0 ; i <= 2 ; ++i)
			System.out.printf("val[%d]=%d\n",i,val[i]);
		
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0 ;
		System.out.print("이름을 입력하시오:");
		myname = sc.nextLine();
		System.out.print("나이 입력하시오:");
		myage = sc.nextInt();
		
		Person hyunbin = new Person(myname,myage);
		System.out.printf("hyunbin.name=%s\n",hyunbin.getName());
		System.out.printf("hyunbin.age=%d\n",hyunbin.getAge());
		
		
		
															//2)매개변수로 전달된 값으로 초기값(초기화) 설정(선택)
		Person hodong = new Person("호동", 45);  //생성자 함수 역할 1)메모리에 객체를 생성시키는 것(필수)
		System.out.printf("hodong.name=%s\n",hodong.getName() );  //hodong객체의 getname이 호출됨	
		System.out.printf("hodong.age=%d\n",hodong.getAge() );
		
		Person gildong = new Person();  //person클래스(기본생성자) 메모리에 새로운 공간을 할당 
										//(new 연산자가 반환하는 것을 gildong(객체 참조 변수/외부객체)에 할당)
		//gildong.name = "길동"; //gildong객체의 name이라는 변수를 활용
		gildong.setName("길동");  //public이기 때문에 main함수에 접근 가능
		
		//System.out.printf("gildong.name=%s\n",gildong.name);
		System.out.printf("gildong.name=%s\n",gildong.getName() );
		
		//gildong.age = 23;
		gildong.setAge(23);
		//System.out.printf("gildong.age=%d\n",gildong.age);
		System.out.printf("gildong.age=%d\n",gildong.getAge() );
		
		
		gildong.talk(); //gildong객체의 talk메서드 호출			

	}

}
