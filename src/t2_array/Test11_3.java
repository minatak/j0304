package t2_array;

// 2차원 배열 (불규칙 값 저장)
/*
 		100 50 80 90
 		40  70
 		100 90 50 20
 		85  10 40 
 */
public class Test11_3 {
	public static void main(String[] args) {
		int[][] atom = 
			{		
				{100,50,80,90}, // 자바에서만 이런 행열이 가능함!
				{40,70},
				{100,90,50,20},
				{85,10,40}
			}; 
		
	
		//배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<atom.length; i++) {
			for(int j=0; j<atom[i].length; j++) {
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
