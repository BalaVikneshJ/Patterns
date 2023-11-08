package summa;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(4);
		System.out.println();
		pattern2(4);
		System.out.println();
		pattern3(4);
		System.out.println();
		pattern4(4);
		
	}
	static void pattern1(int n) {
		for(int i= 1;i<=n;i++) {
			for(int j = n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for(int i= 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int i = 0; i < 2*n;i++) {
			int total = i > n ? 2*n - i :i;
			for(int j = 1;j<=total;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int i = 1;i<=n;i++) {
			int space = n - i;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
				}
			for(int z = 1;z<=i;z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


