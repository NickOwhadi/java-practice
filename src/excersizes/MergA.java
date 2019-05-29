package excersizes;

import java.util.Arrays;

public class MergA {

	public static int[] mergR(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] ret = new int[length];
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			ret[z] = a[i];
			z++;
		}
		for (int j = 0; j < b.length; j++) {
			ret[z] = b[j];
			z++;
		}
		return ret;
	}// end mergR

	public static void main(String[] args) {
		int[] c = { 1, 2, 3 };
		int[] d = { 4, 5, 6 };
		System.out.println(Arrays.toString(mergR(c, d)));
	}
}