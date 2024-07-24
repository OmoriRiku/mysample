/* 配列の要素を逆順にするサンプルプログラム */
class Main1 {
	public static void main(String[] args) {
		int[] array = {11, 22, 33, 44, 55};
		int right, left, tmp;

		for (int num : array) {
			System.out.println(num);
		}

		System.out.println("逆順にする");

		for (left = 0; left < array.length / 2; left++) {
			right = array.length - left;
			right -= 1;
			tmp = array[right];
			array[right] = array[left];
			array[left] = tmp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
	}
}