package com.main;
public class Factoriel {

	public static void main(String[] args) {

		System.out.println(factRec(5));

		int n = 5, res = 1;
		for (int idx = 1; idx <= n; idx++) {
			res *= idx;
		}
		System.out.println(res);
	}

	public static Long factRec(int n) { // solve with recursive method
		if (n == 1)
			return 1L;
		else
			return n * factRec(n - 1);
	}

	public static Long factIter(int n) { // solve with recursive method
		Long res = 1L;
		for (int idx = 1; idx <= n; idx++) {
			res *= idx;
		}
		return res;
	}

}
