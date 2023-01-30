package edu.switchone;

public class SwitchOne0127 {

	public static void main(String[] args) {
		int score = 90 ;
		int share = score / 10 ;
		
		switch(share)
		{
			case 10:  //share의 값이 10
				//System.out.println("A학점");
				//break;  //switch블럭을 빠져나간다
			case 9:
				System.out.println("A학점");
				break; //break가 없으면 score가 9여도 다음 case로 넘어가 출력
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break; //break 생략 가능
			}
	}

}
