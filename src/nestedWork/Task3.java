package nestedWork;

public class Task3 {
	public static void main(String[] args) {
		int n = 50;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}

			for (int j = i - 1; j >= 1; j--) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}

			for (int j = i - 1; j >= 1; j--) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}
