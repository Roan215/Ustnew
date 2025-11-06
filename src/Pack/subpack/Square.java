package Pack.subpack;

public class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int i, j;
		int n= 5;

		// outer loop to handle number of rows
		for (i = 0; i < n; i++) {

			// inner loop to handle number of columns
			for (j = 0; j < n; j++) {

				// star will print only when it is in first
				// row or last row or first column or last
				// column
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				}

				// otherwise print space only
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
