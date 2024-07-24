import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//	インスタンス生成
		MakeArray makeArray = new MakeArray();

		//	引数用の配列in
		int[] in = {3, 2, 1, 6, 5, 4};

		//	ループ制御用
		int i;

		//	MakeArrayクラスのmakeNewArrayメソッドの呼び出し
		List<Integer> out = makeArray.makeNewArray(in);

		//	結果を表示
		for(i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}
	}

}