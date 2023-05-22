import java.util.Scanner;

public class PascalsTriangleRecursion {

  public static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
        }
    }
  
    public static void main(String[] args) {

		    Scanner s = new Scanner(System.in);
		    int rowCount = s.nextInt();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < rowCount - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", pascalValue(i, j));
            }
            System.out.println();
        }
    }
}
