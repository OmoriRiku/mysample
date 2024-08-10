class Main {

	public static void main(String[] args) {
		int[][] edgeList = {
			{0, 2},
			{0, 3},
			{2, 3},
			{1, 3},
			{3, 4}
		};

		int[][] adjMatrix = adjMatrix(edgeList, 5);

		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[i].length; j++) {
				System.out.print(adjMatrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] adjMatrix(int[][] edgeList, int nodeNum) {
		int[][] adjMatrix = new int[nodeNum][nodeNum];

		int i, u, v;

		for (i = 0; i < edgeList.length; i++) {
			u = edgeList[i][0];
			v = edgeList[i][1];

			adjMatrix[u][v] = 1;
			adjMatrix[v][u] = 1;
		}

		return adjMatrix;
	}

}