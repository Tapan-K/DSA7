package in.ineuron.assgnment7;

public class CheckStraightLineQ8 {
	public static boolean checkStraightLine(int[][] coordinates) {
		int[] firstPoint = coordinates[0];
		int[] secondPoint = coordinates[1];

		// Calculate the slope between the first two points
		double slope = calculateSlope(firstPoint, secondPoint);

		
		for (int i = 2; i < coordinates.length; i++) {
			int[] currentPoint = coordinates[i];
			double currentSlope = calculateSlope(firstPoint, currentPoint);

			
			if (currentSlope != slope) {
				return false;
			}
		}

		return true;
	}

	private static double calculateSlope(int[] point1, int[] point2) {
		int x1 = point1[0];
		int y1 = point1[1];
		int x2 = point2[0];
		int y2 = point2[1];

		// Calculate the slope using the formula (y2 - y1) / (x2 - x1)
		return (double) (y2 - y1) / (x2 - x1);
	}

	public static void main(String[] args) {
		// Q.8

		int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };

		boolean isStraightLine = checkStraightLine(coordinates);
		System.out.println(isStraightLine);

	}

}
