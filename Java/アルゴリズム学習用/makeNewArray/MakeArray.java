/*
	引数で渡された配列の要素を一つずつ足した値で配列を作る
	in {3, 2, 1...} → out {3, 5, 6...}
*/

import java.util.List;
import java.util.ArrayList;

public class MakeArray {

	public List<Integer> makeNewArray(int[] in) {
		List<Integer> out = new ArrayList<>();

		int i;

		int tail;

		out.add(in[0]);

		for (i = 1; i < in.length; i++) {
			tail = out.get(out.size() - 1);
			out.add(tail + in[i]);
		}

		return out;
	}

}