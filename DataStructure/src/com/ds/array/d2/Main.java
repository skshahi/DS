package com.ds.array.d2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private static final Logger logger = Logger.getLogger("Main.class"); 
	public static void main(String[] args) {
		TwoDimentionalArray tda=new TwoDimentionalArray(3, 3);
	//	tda.insertElementAtIndex(0, 0, 10);
		tda.insertValue();
		//System.out.println(Arrays.deepToString(tda.arr));
		//logger.info("{0}"+));
	//	logger.log(Level.INFO, "Array List: {0} ", Arrays.deepToString(tda.arr));  // String formatting only applied if needed

		tda.traversal2DArray();
		//tda.searchValue(7);
		
		tda.deleteElement(70);
		tda.traversal2DArray();
	//tda.accessCell(1,0);
	}

}
