/* Areege Chaudhary
 * Student #: 10197607
 * I confirm that this submission is my own work and is consistent 
 * with the Queen's regulations on Academic Integrity.
 */

import java.util.*;

public class BinarySearchTree {

	BinaryTreeVertex root;
	
	public BinarySearchTree() {
		this.root = null;
	} //end constructor 
	
	public void Insert(int value) {
		this.root = recInsert(root, value);
	}
	
	public BinaryTreeVertex recInsert(BinaryTreeVertex current, int value) {
		if (current == null) {
			return new BinaryTreeVertex(value);
		} //end if1
		else {
			if (current.value < value) {
				current.right = recInsert(current.right, value);
			}//end if2
			else {
				current.left = recInsert(current.left, value);
			} //end else2
		} //end else1
		return current;
	} //end recInsert method
	
	
	
	public int[] SearchPath(int value) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		BinaryTreeVertex current = root;
		while (current != null) {
			if (current.value == value) {
				al.add(current.value);
				break;
			}//end if
			else if (current.value < value) {
				al.add(current.value);
				current = current.right;
			}//end elif
			else {
				al.add(current.value);
				current = current.left;
			}//end else
		}//end while
		al.trimToSize();
		int[] finalList = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			finalList[i] = al.get(i);
		}
		return finalList;
	}//end searchpath method
	
	public int Total_Depth(BinaryTreeVertex tree) {
		return rec_Total_Depth(tree, 0);
	}//end totaldepth method
	
	public int rec_Total_Depth(BinaryTreeVertex current, int depth) {
		if (current == null) {
			return 0; 
		} //end if
		else {
			return depth + rec_Total_Depth(current.left, depth + 1) + rec_Total_Depth(current.right, depth + 1);
		} //end else
	} //end method
	
	

	
}//end class