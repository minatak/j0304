package t2_array;

// 향상된 for문(객체 안의 내용을 반복처리 할 수 있다.)
public class Test3 {
	public static void main(String[] args) {
		int[] su = {100,80,50,30,70,60};
		
		System.out.println("일반적인 for문 출력");
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		
		//향상된 for문 :			for(변수타입 배열안의값을담을변수: 객체명 또는 배열명)  이 명령 제대로 외우기. 자바 스크립트 들어가면서 헷갈리게 됨
		System.out.println("향상된 for문 출력");
		for(int s : su) {
			System.out.print(s + " / ");
		}
		System.out.println();
		
		System.out.println("향상된 for문 출력(번지수와 함께 출력하고자 한다)");
		int sel = 0;
		for(int s : su) {
			System.out.println(sel + "번지 : " + s);
			sel++;
		}
		System.out.println();
	}
}
