package t2_array;

public class Test1 {
	public static void main(String[] args) {
		
//		int mbc1 = 0;
//		int mbc2 = 0;
//		int mbc3 = 0;
//		int mbc4 = 0;
//		int mbc5 = 0;
		
//		int mbc1 = 5;
//		int mbc2 = 5;
//		int mbc3 = 5;
//		int mbc4 = 5;
//		int mbc5 = 5;
		
		int mbc1 = 10;
		int mbc2 = 20;
		int mbc3 = 30;
		int mbc4 = 40;
		int mbc5 = 50;
		
		int kbc1 = 100;
		int kbc2 = 30;
		int kbc3 = 80;
		int kbc4 = 50;
		int kbc5 = 90;
		
		System.out.println("mbc1 = " + mbc1);
		System.out.println("mbc2 = " + mbc2);
		System.out.println("mbc3 = " + mbc3);
		System.out.println("mbc4 = " + mbc4);
		System.out.println("mbc5 = " + mbc5);
		System.out.println();
		
		System.out.println("kbc1 = " + kbc1);
		System.out.println("kbc2 = " + kbc2);
		System.out.println("kbc3 = " + kbc3);
		System.out.println("kbc4 = " + kbc4);
		System.out.println("kbc5 = " + kbc5);
		System.out.println();
		
//		int[] mbc;
//		mbc = new int[5];
		
		int[] mbc = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i)+"] = " + mbc[i]);
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			mbc[i] = 5;
		}
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i)+"] = " + mbc[i]);
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			mbc[i] = (i+1) * 10;
	}
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i)+"] = " + mbc[i]);
		}
		System.out.println();
		
		int[] kbc = new int[5];
		kbc[0] = 100;
		kbc[1] = 30;
		kbc[2] = 80;
		kbc[3] = 50;
		kbc[4] = 90;
		
		for(int i=0; i<5; i++) {
			System.out.println("kbc["+(i)+"] = " + kbc[i]);
		}
		System.out.println();
		
		int[] kbc21 = new int[] {100, 30, 80, 50, 90};
		
		for(int i=0; i<5; i++) {
			System.out.println("kbc21["+(i)+"] = " + kbc21[i]);
		}
		System.out.println();
		
		int[] kbc31 = {100, 30, 80, 50, 90};
		
		for(int i=0; i<5; i++) {
			System.out.println("kbc31["+(i)+"] = " + kbc31[i]);
		}
		System.out.println();
	}
}
