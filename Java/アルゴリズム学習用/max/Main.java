/* 引数の配列の中から最大値を返す */

class Main {

	public static void main(String[] args) {
		int[] ten = {15, 89, 3, 100, 27};

		int max = maxData(ten);

		System.out.println("配列tenの値を表示");
		for (int i = 0; i < ten.length; i++) {
			System.out.print("ten[" + i + "] : " + ten[i] + " , ");
		}

		System.out.println();

		System.out.println("最大値：" + max);
	}

	public static int maxData(int[] ten) {
		int i, max;

		max = ten[0];

		for (i = 1; i < ten.length; i++) {
			if (max < ten[i]) {
				max = ten[i];
			}
		}

		return max;
	}

}