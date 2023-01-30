package edu.gugudan;

public class GuGuDan0127 {

	public static void main(String[] args) {
		int dan = 2, val = 1;
		
		for(dan =2 ; dan <= 9 ; ++dan)
		{	
			for(val = 1 ; val <= 9 ; ++val)
			{	
				if (val == 4)
					break;
				//if (val == 4)
					//continue;  //val == 4를 실행하고 싶지 않을 때 
				System.out.printf("%d * %d = %d\n",
									dan, val, dan*val);
			}
		}
		for(int i = 1 ; i <= 10 ; ++i)
		{	//if ( i==6 )
			//	break;  //break와 가장 가까운 반복문을 빠져 나옴
			if (i == 4)
				continue;  //조건이 참일 때 continue실행 그 뒤에 있는 명령문 무시, 증감식으로 올라감
				//System.out.printf("나 실행될까?");
				
			System.out.printf("i=%d\t",i);
		}

	}
}
