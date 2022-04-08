package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다. ** (= break)
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */
class ReturnEx {
	
	void setScore1 (int score1) { // 받고 끝
		score1 = 100;
	}
	
	int setScore2 (int score2) { // 받고 다시 돌려주기 
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		
		System.out.println("리턴전 명령어1");
		System.out.println("리턴전 명령어2");
		System.out.println("리턴전 명령어3");
		
		// return 1,2,3,4,5; // 3) 복수의 return값은 불가능하므로 error가 발생한다. 
		return 0; // 먼저 작성 > 빨간줄 없애기 가능 
		
		// 2) return을 만나는 순간 메서드가 종료되므로 아래의 명령어에서 error가 발생한다. 
//		System.out.println("리턴후 명령어1"); 
//		System.out.println("리턴후 명령어2");
//		System.out.println("리턴후 명령어3");
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx test = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score1); // 87
		
		test.setScore1(score1); // 올라갔다가 내려오지 않아서 값이 그대로 
		System.out.println("메서드 호출 후의 성적 : " + score1); // 87
		
		System.out.println();
		
		int score2 = 87;
		System.out.println("메서드 호출 전의 성적 : " + score2); // 87
		
		test.setScore1(score2); // > test 전체가 100 
		System.out.println("메서드 호출 후의 성적 : " + score2); // 87 > score2 는 87
		
		score2 = test.setScore2(score2);
		System.out.println("메서드 호출 후의 성적 : " + score2); //100 
		
	}

}
