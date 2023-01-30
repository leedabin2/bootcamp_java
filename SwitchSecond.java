package edu.switchtwo;

public class SwitchSecond {

	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("사자");
		whoIsIt("독수리");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("연어");
		whoIsIt("곰팡이");
		String tmp = null ;
		tmp = fone(1);
		System.out.println("tmp="+tmp);
		tmp = fone(2);
		System.out.println("tmp="+tmp);
		tmp = fone(3);
		System.out.println("tmp="+tmp);
	}//end of main
	
	/*static void whoIsIt(String bio)
	{
		String kind = "" ;
		switch(bio)  
		{
		case "호랑이":  //case(상수) - 문자열 상수도 가능
		case "사자":
			kind = "표유류";
			break;
		case "독수리":
		case "참새":
			kind = "조류";
			break;
		case "고등어":
		case "연어":
			kind = "어류";
			break;
		default:
			System.out.println("어이쿠! ");
			kind = "...";
		} //end of switch()
		
		System.out.printf("%s는 %s이다\n",bio,kind);
	} //end of whoisit()*/
		
	/*static void whoIsIt(String bio)
	{
		String kind = "" ;
		switch(bio)  //switch문은 함수가 아님 yield를 반환해서 연산식을 종료할 수 있음
		{
		case "호랑이" , "사자" ->kind = "표유류";
			
		case "독수리" , "참새" ->kind = "조류";
		
		case "고등어" , "연어" ->kind = "어류";
		
		default -> {
			System.out.println("어이쿠! ");
			kind = "...";
			}
		} //end of switch()
		
		System.out.printf("%s는 %s이다\n",bio,kind);
	} //end of whoIsIt()*/
	
	static String fone(int  n)
	{
		return switch(n)
				{
					case 1 -> "한개";
					case 2 -> "두개";
					default -> "많이";
				};
	}
	
	static void whoIsIt(String bio)
	{
		String kind = switch(bio)  //switch의 yeild값을 반환한 switch의 결과를 kind의 변수에 입력
		{
		case "호랑이" , "사자" -> "표유류";  //bio의 변수(호랑이,사자)를 입력하면 "표유류"를 kind에 반환함
			
		case "독수리" , "참새" -> "조류";
		
		case "고등어" , "연어" -> "어류";
		
		default -> {
			System.out.println("어이쿠! ");
			yield "...";
			}
		} ; //end of switch() //string kind = 부터는 하나의 문장이라서 ;을 넣어줌
		
		System.out.printf("%s는 %s이다\n",bio,kind);
	} //end of whoisit()
	
}
