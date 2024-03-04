package t2_array;

import java.util.Scanner;

// 2차항 배열에 입력된 값 주입하기
// 입력자료 : 3명 학생의 번호, 국어, 영어, 수학점수가 입력된다. 입력된 값들을 모두 출력하시오.
public class Test13 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; //앞->학생 명 수, 뒤[]->입력될 값 항 개수 (번호,국어,..수학 총 4개)
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"번호","국어","영어","수학"};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<title.length; j++) {
			System.out.print((i+1) + ". " + title[j] + "를 입력하세요(종료:999) : ");
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("* 출력자료 *");
		System.out.println("번호\t국어\t영어\t수학\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<title.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
