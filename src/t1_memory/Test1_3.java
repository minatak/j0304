package t1_memory;

import java.util.Scanner;

public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt + ".");
			System.out.print("작업을 계속할까요?(Y:계속, N:그만) ");
			ans = sc.next(); //nextLine() = 엔터를 칠 때까지 입력가능. 여러개 받을 때 사용.
			if(ans.equals("N")) break; //참조타입 객체를 비교할 때는 무조건 .equals()를 써야 함
		}
		System.out.println("작업 끝");
		
		sc.close();
	}
}
