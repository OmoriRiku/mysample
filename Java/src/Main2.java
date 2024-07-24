class Main2 {
	
	public static void main(String[] args) {
		//	コマンドライン引数から受け取った数値をint型に変換し、変数numに代入する
		int num = Integer.parseInt(args[0]);

		//	fizzBuzzメソッドの呼び出しを行い、変数に戻り値を代入する。
		String result = fizzBuzz(num);

		//	結果をコンソールに表示する。
		System.out.println(result);
	}

	public static String fizzBuzz(int num) {
		//	戻り値用の変数result
		String result;

		//	numが3と5（例：15）で割り切れる場合
		if (num % 3 == 0 && num % 5 == 0) {
			result = "3 と 5で割り切れる";
		
		//	numが5で割り切れる場合
		} else if (num % 5 == 0) {
			result = "5 で割り切れる";

		//	numが3で割り切れる場合
		} else if (num % 3 == 0) {
			result = "3で割り切れる";

		//	numが3でも5でも割り切れない場合
		} else {
			result = "3 でも 5でも割り切れない。";
		}

		//	文字列を返す
		return result;
	}
}