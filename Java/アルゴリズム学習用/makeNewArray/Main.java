import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		MakeArray makeArray = new MakeArray();

		int[] in = {3, 2, 1, 6, 5, 4};
		int i;

		List<Integer> out = makeArray.makeNewArray(in);

		for(i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}
	}

}