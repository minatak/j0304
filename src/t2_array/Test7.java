package t2_array;

// 2차원 배열
public class Test7 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4]; //앞[]가 행, 뒤[]가 열. 2차원은 []를 두개 써야 함. 3차원은 세개, 4차원은 네개...
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[0][i] + " / ");
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[1][i] + " / ");
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(atom[2][i] + " / ");
		}
		System.out.println();
		System.out.println("====================");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
