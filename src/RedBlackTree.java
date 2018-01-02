/* Areege Chaudhary
 * Student #: 10197607
 * I confirm that this submission is my own work and is consistent 
 * with the Queen's regulations on Academic Integrity.
 */

import java.util.ArrayList;

public class RedBlackTree {
	
	public RBTVertex root;
	public int rotationCount;
	
	public void Insert(int value) {
		this.root = recInsert(root, value);
		this.root.colour = false; //set colour of root to black 
	}
	
	private RBTVertex recInsert(RBTVertex current, int value) {
		if (current == null) {
			RBTVertex newNode = new RBTVertex();
			newNode.value = value;
			return newNode; //newNode is now the root
		} //end if
		else if (value > current.value) {
			current.right = recInsert(current.right, value);
			if (current.colour == true) {
				return current;
			} //end if
			else {
				if (current.right.colour == true) {
					if (current.right.right != null) {
						return RB_right_right_fix(current);
					} //end if
					else if (current.right.left != null) {
						return RB_right_left_fix(current);
					} //end else if
					else {
						return current;
					}//end else
				} //end if
				return current;
			}//end else
		} //end else if  
		else {
			current.left = recInsert(current.left, value);
			if (current.colour == true) {
				return current;
			} //end if 
			else {
				if (current.left.colour == true) {
					if (current.left.left != null) {
						return RB_left_left_fix(current);
					} //end if 
					else if (current.left.right != null) {
						return RB_left_right_fix(current);
					} //end else if
					else {
						return current;
					} //end else
				} //end if
				return current;
			}//end else
		} //end else
	} //end recInsert
	
	private RBTVertex RB_right_right_fix(RBTVertex current) {
		RBTVertex child = current.right;
		RBTVertex sib = current.left;
		if (sib != null) {
			if (sib.colour == true) {
				child.colour = false;
				sib.colour = false;
				current.colour = true;
				return current;
			} //end if
			else {
				return current;
			} //end else
		} //end if
		else {
			rotationCount += 1;
			current.right = child.left;
			child.left = current;
			child.colour = false;
			current.colour = true;
			return child;
		}//end else
	}//end method
	
	private RBTVertex RB_left_left_fix(RBTVertex current) {
		RBTVertex sib = current.right;
		RBTVertex child = current.left;
		if (sib != null) {
			if (sib.colour == true) {
				child.colour = false;
				sib.colour = false;
				current.colour = true;
				return current;
			} //end if
			else {
				return current;
			} //end else
		} //end if
		else {
			rotationCount += 1;
			current.left = child.right;
			child.right = current;
			child.colour = false;
			current.colour = true;
			return child;
		}//end else
	} //end method
	
	private RBTVertex RB_right_left_fix(RBTVertex current) {
		RBTVertex child = current.right;
		RBTVertex sib = current.left;
		if (sib != null) {
			if (sib.colour == true) {
				child.colour = false;
				sib.colour = false;
				current.colour = true;
				return current;
			} //end if
			else {
				return current;
			}//end else
		}//end if
		else {
			rotationCount += 1;
			RBTVertex grandchild = child.left;
			child.left = grandchild.right;
			current.right = grandchild.left;
			grandchild.left = current;
			grandchild.right = child;
			grandchild.colour = false;
			current.colour = true;
			return grandchild;
		}//end else
	}//end method
	
	private RBTVertex RB_left_right_fix(RBTVertex current) {
		RBTVertex sib = current.right;
		RBTVertex child = current.left;
		if (sib != null) {
			if (sib.colour == true) {
				child.colour = false;
				sib.colour = false;
				current.colour = true;
				return current;
			}//end if
			else {
				return current;
			}//end else
		}//end if 
		else {
			rotationCount += 1;
			RBTVertex grandchild = child.right;
			child.right = grandchild.left;
			current.left = grandchild.right;
			grandchild.right = current;
			grandchild.left = child;
			grandchild.colour = false;
			current.colour = true;
			return grandchild;
		}//end else
	}//end method

	public int Total_Depth(RBTVertex tree) {
		return rec_Total_Depth(tree, 0);
	}//end totaldepth method
	
	public int rec_Total_Depth(RBTVertex current, int depth) {
		if (current == null) {
			return 0; 
		} //end if
		else {
			return depth + rec_Total_Depth(current.left, depth + 1) + rec_Total_Depth(current.right, depth + 1);
		} //end else
	} //end method
	
	public ArrayList<SPObject> SearchPath(int value) {
		//SPObject allows the storage of both a colour value and a data value
		ArrayList<SPObject> al = new ArrayList<SPObject>();
		RBTVertex current = root;
		while (current != null) {
			if (current.value == value) {
				al.add(new SPObject(current.colour, current.value));
				break;
			}//end if
			else if (current.value < value) {
				al.add(new SPObject(current.colour, current.value));
				current = current.right;
			}//end elif
			else {
				al.add(new SPObject(current.colour, current.value));
				current = current.left;
			}//end else
		}//end while
		al.trimToSize();
		return al;
	}//end searchpath method
	
}//end class
