/*
	引数で渡された配列の要素を一つずつ足した値でListを作る
	in {3, 2, 1...} → out {3, 5, 6...}
*/

import java.util.List;
import java.util.ArrayList;

public class MakeArray {

	public List<Integer> makeNewArray(int[] in) {
		//	戻り値用のList
		List<Integer> out = new ArrayList<>();

		//	ループ制御
		int i;

		//	仮に格納する変数
		int tail;

		//	in配列のインデックス0の値を追加
		out.add(in[0]);

		//	配列の要素を一つずつ足した値をListに追加する
		for (i = 1; i < in.length; i++) {
			tail = out.get(out.size() - 1);
			out.add(tail + in[i]);
		}

		//	追加後のListを返却
		return out;
	}

}