package basics;
/**
 * this is like water bottle
 * @author avich
 *
 */

public class Employee {
	/**
	 * this is like water
	 */
	private String dateOfBirth;//private --seal of bottle
	
	//tap
	private String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * cap of the bottle
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth= dateOfBirth;
	}
	public int getAge() {
		String age=dateOfBirth + "";
		return 18;
	}

}
