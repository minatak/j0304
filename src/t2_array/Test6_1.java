package t2_array;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray); //char 타입 배열은 String 클래스처럼 사용가능
	}
}
