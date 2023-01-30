package edu.staticex;

public class StaticEx0127 {

	public static void main(String[] args) {
		int  a = 3, b = 5 ; res = 0 ;
		res = sum(a,b);  //a,b값이 sum메서드의 pa,pb에 할당
		System.out.printf("res=%d\n", res);
	}//end of main()

	public static int sum(int pa, int pb) 
	{
		int tot = 0 ;
		tot = pa + pb ;
		return tot ;
	}
}
