package step6_02.method;

import java.io.FileWriter;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return + 문맥)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값도 없고, 결과값도 없는 경우
	void type00() {
		System.out.println("=============");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 정보조회");
		System.out.println("4. 정보수정");
		System.out.println("5. 종료");
		System.out.println("============\n");
	}
	
	// 입력값은 있고, 결과값은 없는 경우
	void type10(String fileName) { // fileName >> void 안에서만 사용 가능 
		
		try {
			FileWriter fw = new FileWriter(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		} 	
	}
	
	// 입력값과 결과값이 모두 있는 경우
	
	int type11(String birth) { //birth = 19800101
		String temp = birth.substring(0, 4);
		int age = 2022 - Integer.parseInt(temp) + 1; // 한국나이는 1살 먹고 시작 
		return age; // 리턴되는 형식에 따라 void 자리가 바뀜******** 
	}
	
	// 입력값은 없고, 결과값이 있는 경우 
	double type01() {
		return 3.141592;
	}
	
}
public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType test = new MethodType();
		
		// 입력값도 없고, 결과값도 없는 경우 
		test.type00();
		System.out.println();
		
		// 입력값은 있고, 결과값은 없는 경우 
		test.type10("팀 버너스리.txt");
		test.type10("데니스 리치.txt");
		test.type10("제임스 고슬링.txt");
		test.type10("진수빈.txt");
		// test.type10('C'); // 에러 (아규먼트의 타입이 일치해야만 한다.)
		// test.type10(100);
		// test.type10("파일1.txt" , "파일2.txt"); > 에러 (아규먼트의 개수이 일치해야만 한다.)
		// test.type10("파일3.txt" , 4); // 에러 아규먼트의 타입도 개수도 일치해야한다.
		
		// 입력값은 없고, 결과값이 있는 경우 
		System.out.println(test.type01());
		
		double pi = test.type01();
		System.out.println("PI : " + pi);
		System.out.println();
		
		
		// 입력값과 결과값이 모두 있는 경우 
		System.out.println("나이 : " +test.type11("19800101") + "살");
		
		int age = test.type11("19980101");
		System.out.println("나이 : " + age + "살");
		
		if (test.type11("20220101") == 1) {
			System.out.println("나이 : 1살");
		}

	}

}
