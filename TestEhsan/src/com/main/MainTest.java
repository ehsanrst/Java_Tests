package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainTest {

	public static void main(String[] arg) {

		// File file = new File("C:\\Users\\Ehsan\\Pictures\\1.jpg");
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\Users\\Ehsan\\Pictures\\1.jpg");
			out = new FileOutputStream("C:\\Users\\Ehsan\\Pictures\\11.jpg");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (Exception ex) {
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// Cat ehsanCat = new Cat("Milk");
		// ehsanCat.eatingMode();
		// ehsanCat.setFoodName("kharmagas");
		// ehsanCat.getLegCount();

		// Calendar cal = Calendar.getInstance();
		//
		// System.out.println(cal.get(Calendar.YEAR));
		//
		// cal.set(Calendar.YEAR, 2011);
		//
		// System.out.println(cal.get(Calendar.YEAR));

		// System.out.println(Factoriel.factRec(10));
		//
		// Calendar cal2 = Calendar.getInstance();
		//
		// System.out
		// .println((cal2.getTimeInMillis() - cal.getTimeInMillis()) / 1000);
		//
		// Calendar cal3 = Calendar.getInstance();
		// System.out.println(Factoriel.factIter(10));
		//
		// Calendar cal4 = Calendar.getInstance();
		//
		// System.out
		// .println((cal4.getTimeInMillis() - cal3.getTimeInMillis()) / 1000);

		//
		//
		//
		// int[] ehsanIntArray = new int[5];// ehsanIntArray size is 5
		// ehsanIntArray[0] = 1;
		// ehsanIntArray[1] = 2;
		// ehsanIntArray[2] = 7;
		// ehsanIntArray[3] = 5;
		// ehsanIntArray[4] = 4;
		//
		// int ii=Factoriel.fact(3);
		//
		// // ehsanIntArray = new int[15];// reallocate ehsanintarry
		//
		// for (int idx = 0; idx < 5; idx++)
		// System.out.println(ehsanIntArray[idx]);

	}
	// Square s = new Square();
	// double area = s.area();
	// double surface = s.surface();
	//
	// System.out.println("area is: " + area);
	// System.out.println("serface is: " + surface);
	//
	// // s.length = 20;
	// s.setLength(20);
	// System.out.println(s.getLength());
	//
	// area = s.area();
	// surface = s.surface();
	//
	// System.out.println("area is: " + area);
	// System.out.println("serface is: " + surface);
	//
	// s.printInfo(!true);
	// System.out.println(256 % 100); // mod is 56
	// }
	// naming conversion
	// Class name camel case
	//
	/*
	 * dsfds sdf sd fsd
	 */

	// salam khubi?

	// public static void main(String[] args) {
	// //
	// // int intNum = 14;
	// // int intNum2 = 3;
	// // int intNum4 = 0;
	// //
	// // // max int number ??????
	// //
	// // long longNum = 1254535;
	// //
	// // float floatNum = 1.22f;
	// // double doubleNum = 11.2;
	// //
	// // boolean boolNumber = true;// false;
	// //
	// // String str = "Ehsan Roustaee 1370";
	// // char chr = 'e';
	// //
	// // byte byt = 127;
	// //
	// // System.out.println("Hello Ehsan :)");
	// // System.out.println(str);
	// // System.out.println(boolNumber);
	// //
	// // Scanner scan = new Scanner(System.in);
	// // intNum = scan.nextInt();
	// //
	// // System.out.println("STR = " + str);
	// //
	// // str = "meghdare jadid";
	// //
	// // intNum = 225;
	// // System.out.println(str);
	//
	// Integer intNum = 1;
	// Integer intNum2 = 2;
	//
	// Integer sum = intNum + intNum2;// mod
	//
	// // if (....) {
	//
	// // }
	//
	// // if(...)
	// // {
	// //
	// // }
	// // else
	// // {
	// //
	// // }
	//
	// // if(...)
	// // {
	// //
	// // }
	// // else if(...)
	// // {
	// //
	// // }
	//
	// // if ((sum > 2) && (intNum > 5)) {
	// // System.out.println("sum is bigger than 2");
	// // } else {
	// // System.out.println("sum is less than 2");
	// // }
	// //
	// // if (((sum > 2) || (intNum > 5)) || (intNum2 < 5)) {
	// // System.out.println("sum is bigger than 2");
	// // } else {
	// // System.out.println("sum is less than 2");
	// // }
	// //
	// // int esNum = 10;
	// //
	// // if (esNum == 1) {
	// // System.out.println("es num is 1");
	// // } else if (esNum == 2) {
	// // System.out.println("es num is 2");
	// // }
	// //
	// // switch (esNum) {
	// // case 1:
	// // System.out.println("");
	// // break;
	// // case 2:
	// // System.out.println("esnum is 2");
	// // break;
	// // default:
	// // System.out.println("man che danam!!!");
	// //
	// // }
	// //
	// // while (intNum < 10) {
	// // System.out.println("hey beccharkh...");
	// // // intNum = intNum + 1;
	// //
	// // // intNum += 1;
	// //
	// // intNum++;
	// // }
	// //
	// // // do
	// // // {
	// // //
	// // // }while()
	// //
	// // int idx = 1;
	// // int idx2 = 0;
	// // for (idx = 10, idx2 = 4; idx > 0 && idx2 < 10; idx--, idx2++) {
	// // System.out.println(idx);
	// // }
	// //
	// // Integer i = 1;
	// // int ii = 2;
	// // if (i == 1f) {
	// // System.out.println("ok");
	// // }
	// //
	// // if (i.equals(1f)) {
	// // System.out.println("ok");
	// // }
	//
	// for (int id = 1; id < 10; id++) {
	// if (id == 3)
	// continue;// ignore the continue of cycle
	// System.out.println(id);
	//
	// }
	//
	// System.out.println(Math.pow(2, 3));
	//
	// }
	//
}
