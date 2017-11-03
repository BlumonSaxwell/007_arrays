package Array_fun;

import javax.swing.JOptionPane;

public class ArrayFun {

	public void showInstructions() {
		
		String[] rules = {"Essential rules for arrays" + "\n1. Arrays have a fixed length at the time they are created"
		+ "\n2. Two ways to set array size:" + "\n-- one way is to set size when created with [size]" 
		+ "\nDynamic - when the program is running" + "\nCan not change size of array" + "\nbut can change the values"};
		
		JOptionPane.showMessageDialog(null, rules);
		
		
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