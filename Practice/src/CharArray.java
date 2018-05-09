public class CharArray {

	public static void main(String[] args) {

		char[] charc = { 'h', 'i', 'k' };
		char[] charc1 = { 'i', 'E', 'h', 's', 'a', 'n', 'h', 'i', 'k', 'n',
				's', 'a', 'l', 'a', 'm', 'h', 'i', 's', 't', 's', 'a', 'l',
				'h', 'i', 'k', 'a', 'm' }; /*
											 * add one more 'k' after 'm' then
											 * program stuck. why???
											 */
		int m = charc.length;
		int n = charc1.length;

		int[][] tempArray = new int[m][n];
		int[] rowArray = new int[n];
		int i = 0;
		int j = 0;

		System.out.println("result:");

		for (i = 0; i < m; i++) {
			int ix = 0;
			for (j = 0; j < n; j++) {
				if (charc[i] == charc1[j]) {
					tempArray[i][ix] = j;
					ix++;
				}

			}

		}
		for (i = 0; i < n; i++) {
			rowArray[i] = tempArray[0][i];
		}
		for (i = 1; i < m; i++) { // need to repair this section ^_^
			int ix = 0;
			for (j = 0; j < n; j++) {
				if (tempArray[i][j] > rowArray[ix]
						&& tempArray[i][j] == rowArray[ix] + 1) {
					rowArray[ix] = tempArray[i][j];
					ix++;
				} else if (tempArray[i][j] > rowArray[ix]) {
					rowArray[ix] = 0;
					ix++;
					j--;
				}
			}
		}
		AutoArrangeInt arrange = new AutoArrangeInt();
		arrange.setN(n);
		arrange.setArray(rowArray);
		rowArray = arrange.Array();
		int q = 0;
		for (i = 0; i < n; i++) {
			if (rowArray[i] != 0) {
				q++;
			}
		}
		System.out.println("repeat " + q + " times at");
		for (i = 0; i < n; i++) {
			if (rowArray[i] != 0) {
				System.out.println(rowArray[i] - m + 1 + "th place");
			}
		}

	}
}
