/*
	スタックを表現するサンプルプログラム
*/

import java.util.List;
import java.util.ArrayList;

class Main {

	//	スタックの格納先
	static List<Integer> st = new ArrayList<>();

	//	インデックスを扱う変数
	static int top = 0;

	public static void main(String[] args) {
		push(3);
		push(7);
		push(8);

		System.out.println(pop);
		System.out.println(st);
	}

	public static void push(int num) {
		st.add(top, num);
		top += 1;
	}

	public static int pop() {
		top -= 1;
		int pop = st.get(top);
		st.remove(top);
		return pop;
	}

}