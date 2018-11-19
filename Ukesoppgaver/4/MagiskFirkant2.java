
/** ************************************************************************************************************************\
Programmet skal ta imot 16 tall fra brukeren for så å sjekke om det danner et kvadrat når de settes inn i en 4x4 array. To ting må testet: er tallene mellom 1 og 16 med i inputen fra brukeren? Når tallene er satt inn i kvadratet, er summen av radene, kolonnene og diagonalen lik hverandre?
\* ************************************************************************************************************************/
public class MagiskFirkant2 {
	public static int N = 4;
	public static int sum = 0;
	public static int[][] readSquare() {
		int[][] square = new int[N][N];
        		Scanner input = new Scanner(System.in);
        		for (int i = 0; i < N; i++) {
            		for (int j = 0; j < N; j++) {
                			int number = input.nextInt();
                			square[i][j] = number;
            		}
        		}
        		input.close();
        		return square;
	}
	public static int leftRightDiagonalSum(int[][] square) {
        		sum = 0;
        		for (int i = 0; i < N; i++) {
            		sum += square[i][i];
        		}
        		return sum;
    	}
	public static int rightLeftDiagonalSum(int[][] square) {
        		sum = 0;
        		for (int i = 0; i < N; i++) {
            		sum += square[i][N - i - 1];
        		}
        		return sum;
    	}
	public static int columnSum(int[][] square, int columnNumber) {
        		sum = 0;
        		for (int i = 0; i < N; i++) {
            		sum += square[i][columnNumber];
        		}
        		return sum;
   	}
	public static int rowSum(int[][] square, int rowNumber) {
        		sum = 0;
        		for (int i = 0; i < N; i++) {
            		sum += square[rowNumber][i];
        		}
        		return sum;
    	}
	public static boolean correctNumbers(int[][] square) {
        		boolean[] seenNumber = new boolean[N * N];
        		for (int i = 0; i < N; i++) {
            		for (int j = 0; j < N; j++) {
                			int number = square[i][j];
                			if (number < 1 || number > (N * N)) {
                    				return false;
                			} else if (seenNumber[number - 1]) {
                    				return false;
                			} else {
                    				square[i][j] = number;
                    				seenNumber[number - 1] = true;
                			}
            		}
        		}
       		return true;
    	}
	public static boolean validMagicSquare(int[][] square) {
       		if (!correctNumbers(square)) {
            		return false;
        		}
        		int baseSum = leftRightDiagonalSum(square);
        		if (baseSum != rightLeftDiagonalSum(square)) {
            		return false;
        		}
        		for (int i = 0; i < N; i++) {
            		if (baseSum != columnSum(square, i)) {
                			return false;
            		}
        		}
        		for (int i = 0; i < N; i++) {
            		if (baseSum != rowSum(square, i)) {
                			return false;
            		}
        		}
        		return true;	
    	}
}
