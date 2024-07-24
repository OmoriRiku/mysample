
class Main {

	public static void main(String[] args) {
		//	コマンドライン引数の数値をint型へ変換する。
		int age = Integer.parseInt(args[0]);

		//	fee()メソッドの呼び出し。
		int price = fee(age);

		//	結果を表示する。
		System.out.println(age + "歳の料金は" + price + "円です。");
	}


	/*
		年齢(数値)を受け取り、料金を返すfee関数。戻り値はint型
		0 ～ 3歳は「100」
		3 ～ 9歳は「300」
		10歳以上	「500」
	*/
	public static int fee(int age) {
		// 戻り値用の変数ret
		int ret;

		// 0 ～ 3歳であれば100円を代入
		if (age <= 3) {
			ret = 100;

		// 3 ～ 9歳であれば300円を代入	
		} else if (age <= 9) {
			ret = 300;

		// 10歳以上であれば500円を代入
		} else {
			ret = 500;
		}

		//	代入された値を返す。
		return ret;
	}
}