/* Areege Chaudhary
 * Student #: 10197607
 * I confirm that this submission is my own work and is consistent 
 * with the Queen's regulations on Academic Integrity.
 */

public class SPObject {
	
	public String colour;
	public int value;
	
	public SPObject(Boolean colour, int value) {
		this.value = value;
		if (colour == true) {
			this.colour = "Red";
		}
		else {
			this.colour = "Black";
		}
	}
	
}
