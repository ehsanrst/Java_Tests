public class AutoArrangeInt {

	private int arraySize;
	private int[] array = new int[arraySize];

	public int getN() {
		return arraySize;
	}

	public void setN(int arraySize) {
		this.arraySize = arraySize;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] Array() {

		for (int i = 0; i < arraySize; i++) {
			int d = array[i];
			for (int j = i + 1; j < arraySize; j++) {
				if (d < array[j]) {
					d = array[j];
					array[j] = array[i];
					array[i] = d;
				}
			}
		}
		return array;
	}
}