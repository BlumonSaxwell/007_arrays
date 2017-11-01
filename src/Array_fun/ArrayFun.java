package Array_fun;

import javax.swing.JOptionPane;

public class ArrayFun {

	public void showInstructions() {
		
		String msg = "Essential rules for arrays";
		String msg1 = "1. Arrays have a fixed length at the time they are created";
		String msg2 = "2. Two ways to set array size:";
		String msg3 = "-- one way is to set size when created with [size]";
		String msg4 = "-- other way is to set size from initial data {n1,n2...";
		String msg5 = "Dynamic - when the program is running";
		String msg6 = "Can not change size of array";
		String msg7 = "but can change the values";
		
		msg = (msg1 + "\n" + msg2 + "\n" + msg3 + "\n" + msg4 + "\n" + msg5 + "\n" + msg6 + "\n" + msg7);
		
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}
	
	public void intArrayExample() {
		
		// Why an array? Store TONS of info in a single, easy variable
		
		int[] intTest = new int[10];
		intTest[0] = 10;
		intTest[1] = 11;
		intTest[2] = 12;
		intTest[3] = 13;
		intTest[4] = 14;
		intTest[5] = 15;
		intTest[6] = 16;
		intTest[7] = 17;
		intTest[8] = 18;
		intTest[9] = 19;
		
		int[] intTwoTest = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0;  i < intTest.length; i++){
		
			System.out.println("intTest[" + i + "]:" + intTest[i]);

		}
		
		for (int i = 0;  i < intTwoTest.length; i++){
	
		System.out.println("intTwoTest[" + i + "]:" + intTest[i]);

}
} 
}//end of ArrayFun class