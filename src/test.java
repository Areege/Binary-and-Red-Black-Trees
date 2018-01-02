/* Areege Chaudhary
 * Student #: 10197607
 * I confirm that this submission is my own work and is consistent 
 * with the Queen's regulations on Academic Integrity.
 */

import java.util.*;

public class test {

	public static void main(String[] args) {
		testBST(); //tests insert, searchpath and totaldepth methods for binary search tree
		testRBT1(); //uses insert and searchpath and checks to see if RBT is properly structured
		testRBT2(); //testing single rotations
		testRBT3(); //testing double rotations
		experiment1();
		experiment2();
	} //end main

	public static void testBST() {
		BinarySearchTree bs = new BinarySearchTree();
		bs.Insert(6);
		bs.Insert(10);
		bs.Insert(20);
		bs.Insert(8);
		bs.Insert(3);
		
		for (int i = 0; i < (bs.SearchPath(6).length); i++) {
			System.out.println(bs.SearchPath(6)[i]);
		}
		System.out.println("Done");
		
		for (int i = 0; i < (bs.SearchPath(10).length); i++) {
			System.out.println(bs.SearchPath(10)[i]);
		}
		System.out.println("Done");
		
		for (int i = 0; i < (bs.SearchPath(20).length); i++) {
			System.out.println(bs.SearchPath(20)[i]);
		}
		System.out.println("Done");
		
		for (int i = 0; i < (bs.SearchPath(8).length); i++) {
			System.out.println(bs.SearchPath(8)[i]);
		}
		System.out.println("Done");
		
		for (int i = 0; i < (bs.SearchPath(3).length); i++) {
			System.out.println(bs.SearchPath(3)[i]);
		}
		System.out.println("Done");

		System.out.println("Total Depth: " + bs.Total_Depth(bs.root));
	}//end method
	
	public static void testRBT1() {
		RedBlackTree rbt = new RedBlackTree();
		rbt.Insert(6);
		rbt.Insert(10);
		rbt.Insert(20);
		rbt.Insert(8);
		rbt.Insert(3);

		ArrayList<SPObject> al = rbt.SearchPath(6);
		ArrayList<SPObject> al2 = rbt.SearchPath(10);
		ArrayList<SPObject> al3 = rbt.SearchPath(20);
		ArrayList<SPObject> al4 = rbt.SearchPath(8);
		ArrayList<SPObject> al5 = rbt.SearchPath(3);
		
		//each for loop prints out the search path (colour of node and value in it) for each value in the RB tree
		for (int i = 0; i < (al.size()); i++) {
			String searchPath = al.get(i).value + " " + al.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al2.size()); i++) {
			String searchPath = al2.get(i).value + " " + al2.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al3.size()); i++) {
			String searchPath = al3.get(i).value + " " + al3.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al4.size()); i++) {
			String searchPath = al4.get(i).value + " " + al4.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al5.size()); i++) {
			String searchPath = al5.get(i).value + " " + al5.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		System.out.println("Total Depth: " + rbt.Total_Depth(rbt.root));	
	}//end method
	
	public static void testRBT2() {
		RedBlackTree rbt = new RedBlackTree();
		rbt.Insert(6);
		rbt.Insert(1);
		rbt.Insert(10);
		rbt.Insert(20);
		rbt.Insert(30);

		ArrayList<SPObject> al = rbt.SearchPath(6);
		ArrayList<SPObject> al2 = rbt.SearchPath(1);
		ArrayList<SPObject> al3 = rbt.SearchPath(10);
		ArrayList<SPObject> al4 = rbt.SearchPath(20);
		ArrayList<SPObject> al5 = rbt.SearchPath(30);
		
		for (int i = 0; i < (al.size()); i++) {
			String searchPath = al.get(i).value + " " + al.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al2.size()); i++) {
			String searchPath = al2.get(i).value + " " + al2.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al3.size()); i++) {
			String searchPath = al3.get(i).value + " " + al3.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al4.size()); i++) {
			String searchPath = al4.get(i).value + " " + al4.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al5.size()); i++) {
			String searchPath = al5.get(i).value + " " + al5.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		System.out.println("Total Depth: " + rbt.Total_Depth(rbt.root));	
	}//end method

	public static void testRBT3() {
		RedBlackTree rbt = new RedBlackTree();
		rbt.Insert(6);
		rbt.Insert(10);
		rbt.Insert(8);
		rbt.Insert(20);
		rbt.Insert(3);
		
		//testing RBT
		ArrayList<SPObject> al = rbt.SearchPath(6);
		ArrayList<SPObject> al2 = rbt.SearchPath(10);
		ArrayList<SPObject> al3 = rbt.SearchPath(8);
		ArrayList<SPObject> al4 = rbt.SearchPath(20);
		ArrayList<SPObject> al5 = rbt.SearchPath(3);
		
		for (int i = 0; i < (al.size()); i++) {
			String searchPath = al.get(i).value + " " + al.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al2.size()); i++) {
			String searchPath = al2.get(i).value + " " + al2.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al3.size()); i++) {
			String searchPath = al3.get(i).value + " " + al3.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al4.size()); i++) {
			String searchPath = al4.get(i).value + " " + al4.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		for (int i = 0; i < (al5.size()); i++) {
			String searchPath = al5.get(i).value + " " + al5.get(i).colour;
			System.out.print("[" + searchPath + "]");
		}//end for loop	
		System.out.println();
		
		System.out.println("Total Depth: " + rbt.Total_Depth(rbt.root));	
	}//end method

	public static void experiment1() {
		
		ArrayList<Integer> perm = new ArrayList<Integer>(); //arraylist so collections.shuffle can be used
		//initializing variables to calculate the sum for each checkpoint
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		double sum5 = 0;
		double sum6 = 0;
		double sum7 = 0;
		double sum8 = 0; 
		double sum9 = 0;
		double sum10 = 0;
		//creating new arrays to hold 500 values (there are 500 trials) for each checkpoint
		int[] chk1 = new int[500];
		int[] chk2 = new int[500];
		int[] chk3 = new int[500];
		int[] chk4 = new int[500];
		int[] chk5 = new int[500];
		int[] chk6 = new int[500];
		int[] chk7 = new int[500];
		int[] chk8 = new int[500];
		int[] chk9 = new int[500];
		int[] chk10 = new int[500];
		
		for (int i = 1; i < 1001; i++) {
			perm.add(i); //adds 1-1000 into arraylist
		} //end for 
		for (int i = 0; i < 500; i++) { //repeat 500 times
			RedBlackTree rbt = new RedBlackTree();
			Collections.shuffle(perm); //creates a random permutation of set
			for (int j = 0; j < 1000; j++) {
				rbt.Insert(perm.get(j));
				if (j == 99) {
					chk1[i] = rbt.rotationCount; //add value to checkpoint 1 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 199) {
					chk2[i] = rbt.rotationCount; //add value to checkpoint 2 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 299) {
					chk3[i] = rbt.rotationCount; //add value to checkpoint 3 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 399) {
					chk4[i] = rbt.rotationCount; //add value to checkpoint 4 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 499) {
					chk5[i] = rbt.rotationCount; //add value to checkpoint 5 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 599) {
					chk6[i] = rbt.rotationCount; //add value to checkpoint 6 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 699) {
					chk7[i] = rbt.rotationCount; //add value to checkpoint 7 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 799) {
					chk8[i] = rbt.rotationCount; //add value to checkpoint 8 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 899) {
					chk9[i] = rbt.rotationCount; //add value to checkpoint 9 rotation count array
					rbt.rotationCount = 0;
				}
				if (j == 999) {
					chk10[i] = rbt.rotationCount; //add value to checkpoint  rotation count array
					rbt.rotationCount = 0;
				}
			}//end for		
		}//end for
		
		//adding up sums
		for (int k = 0; k < 500; k++) {
			sum1 = sum1 + chk1[k];
		}
		for (int k = 0; k < 500; k++) {
			sum2 = sum2 + chk2[k];
		}
		for (int k = 0; k < 500; k++) {
			sum3 = sum3 + chk3[k];
		}
		for (int k = 0; k < 500; k++) {
			sum4 = sum4 + chk4[k];
		}
		for (int k = 0; k < 500; k++) {
			sum5 = sum5 + chk5[k];
		}
		for (int k = 0; k < 500; k++) {
			sum6 = sum6 + chk6[k];
		}
		for (int k = 0; k < 500; k++) {
			sum7 = sum7 + chk7[k];
		}
		for (int k = 0; k < 500; k++) {
			sum8 = sum8 + chk8[k];
		}
		for (int k = 0; k < 500; k++) {
			sum9 = sum9 + chk9[k];
		}
		for (int k = 0; k < 500; k++) {
			sum10 = sum10 + chk10[k];
		}
		//printing out rotation averages for each checkpoint
		System.out.println("Checkpoint 1: " + (sum1/500));
		System.out.println("Checkpoint 2: " + (sum2/500));
		System.out.println("Checkpoint 3: " + (sum3/500));
		System.out.println("Checkpoint 4: " + (sum4/500));
		System.out.println("Checkpoint 5: " + (sum5/500));
		System.out.println("Checkpoint 6: " + (sum6/500));
		System.out.println("Checkpoint 7: " + (sum7/500));
		System.out.println("Checkpoint 8: " + (sum8/500));
		System.out.println("Checkpoint 9: " + (sum9/500));
		System.out.println("Checkpoint 10: " + (sum10/500));
		
	}//end method 
	
	public static void experiment2() {
		int[] nValues = {1000, 2000, 4000, 8000, 16000};
		//create an array for the values in each trial
		double[] n1 = new double[500];
		double[] n2 = new double[500];
		double[] n3 = new double[500];
		double[] n4 = new double[500];
		double[] n5 = new double[500];
		//each r represents a condition for the ratio value
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		int r5 = 0; 
		double sum = 0; 

		for (int i = 0; i < 5; i++) { //for each n value
			ArrayList<Integer> perm = new ArrayList<Integer>(); 
			for (int j = 0; j < nValues[i]; j++) {
				perm.add(j); //filling the arraylist with values from 1 to n
			} //end for 
			for (int k = 0; k < 500; k++) { //500 trials
				BinarySearchTree bst = new BinarySearchTree();
				RedBlackTree rbt = new RedBlackTree();
				Collections.shuffle(perm); //new random permutation
				//add values in the permutation to each tree
				for (int l = 0; l < nValues[i]; l++) {
					bst.Insert(perm.get(l));
					rbt.Insert(perm.get(l));
				}//end for
				double tdBST = bst.Total_Depth(bst.root);
				double tdRBT = rbt.Total_Depth(rbt.root);
				double ratio = tdBST/tdRBT; //calculate ratio
				//System.out.println(ratio); //prints out each ratio value
				sum = sum + ratio; 
				//add ratio value to proper array depending on trial
				if (i == 0) //if n=1000
					n1[k] = ratio;
				if (i == 1) //if n=2000
					n2[k] = ratio;
				if (i == 2) //if n=4000
					n3[k] = ratio;
				if (i == 3) //if n=8000
					n4[k] = ratio;
				if (i == 4) //if n=16000
					n5[k] = ratio;	
			}//end for
			//System.out.println("Done for n = " + nValues[i]); //seperates data based on n value
			System.out.println("Average Ratio for n = " + nValues[i] + ": " + sum/500 );
			sum = 0;
		}//end for
		
		//n = 1000
		for (int i = 0; i < 500; i++) {
			if (n1[i] < 0.5)
				r1 += 1;
			if (n1[i] >= 0.5 && n1[i] < 0.75)
				r2 += 1;
			if (n1[i] >= 0.75 && n1[i] <= 1.25)
				r3 += 1;
			if (n1[i] > 1.25 && n1[i] <= 1.5)
				r4 += 1;
			if (n1[i] > 1.5)
				r5 += 1;
		}//end for
		System.out.println("For n = 1000");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		//resetting r values
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
		
		//n = 2000
		for (int i = 0; i < 500; i++) {
			if (n2[i] < 0.5)
				r1 += 1;
			if (n2[i] >= 0.5 && n2[i] < 0.75)
				r2 += 1;
			if (n2[i] >= 0.75 && n2[i] <= 1.25)
				r3 += 1;
			if (n2[i] > 1.25 && n2[i] <= 1.5)
				r4 += 1;
			if (n2[i] > 1.5)
				r5 += 1;
		}//end for
		System.out.println("For n = 2000");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
		
		//n = 4000
		for (int i = 0; i < 500; i++) {
			if (n3[i] < 0.5)
				r1 += 1;
			if (n3[i] >= 0.5 && n3[i] < 0.75)
				r2 += 1;
			if (n3[i] >= 0.75 && n3[i] <= 1.25)
				r3 += 1;
			if (n3[i] > 1.25 && n3[i] <= 1.5)
				r4 += 1;
			if (n3[i] > 1.5)
				r5 += 1;
		}//end for
		System.out.println("For n = 4000");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
		
		//n = 8000
		for (int i = 0; i < 500; i++) {
			if (n4[i] < 0.5)
				r1 += 1;
			if (n4[i] >= 0.5 && n4[i] < 0.75)
				r2 += 1;
			if (n4[i] >= 0.75 && n4[i] <= 1.25)
				r3 += 1;
			if (n4[i] > 1.25 && n4[i] <= 1.5)
				r4 += 1;
			if (n4[i] > 1.5)
				r5 += 1;
		}//end for
		System.out.println("For n = 8000");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
		
		//n = 16000
		for (int i = 0; i < 500; i++) {
			if (n5[i] < 0.5)
				r1 += 1;
			if (n5[i] >= 0.5 && n5[i] < 0.75)
				r2 += 1;
			if (n5[i] >= 0.75 && n5[i] <= 1.25)
				r3 += 1;
			if (n5[i] > 1.25 && n5[i] <= 1.5)
				r4 += 1;
			if (n5[i] > 1.5)
				r5 += 1;
		}//end for
		System.out.println("For n = 16000");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		r1 = 0;
		r2 = 0;
		r3 = 0;
		r4 = 0;
		r5 = 0;
			
	}//end method
	
} //end test class
