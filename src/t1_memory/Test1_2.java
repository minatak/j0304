package t1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt + ".");
			System.out.print("작업을 계속할까요?(Y:계속, N:그만) ");
			ans = sc.next(); //nextLine() = 엔터를 칠 때까지 입력가능. 여러개 받을 때 사용.
			if(ans == "N") break; /* 연산자 == : 값을 비교하는 연산자. 스텍에 비교하는 값을 비교. 문자인 N은 참조타입이라 hip에 저장됨. 
															 스텍에는 번지수만 남아있음. 참조 타입에 있는 것을 비교하려면 객체를 비교하는 연산자를 써야 함!
		                           객체 비교 연산자 : equals */
		}
		System.out.println("작업 끝");
		
		sc.close();
	}
}
