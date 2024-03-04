package t2_array;

// 2차원 배열 (불규칙 값 저장)
/*
 		100 50 80 90
 		40  70 60 50 
 		100 90 50 20
 		85  10 40 30
 */
public class Test11_2 {
	public static void main(String[] args) {
		int[][] atom = 
			{		
				{100,50,80,90}, //행의 크기는 배열명.length 임
				{40,70,60,50},
				{100,90,50,20},
				{85,10,40,30}
			}; 
		
	
		//배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<atom.length; i++) {
			for(int j=0; j<atom[0].length; j++) {
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
