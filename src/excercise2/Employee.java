package excercise2;

public class Employee extends Person implements ILabelisale {
	private double salary;
	private String holiday;
	private int year;
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the holiday
	 */
	public String getHoliday() {
		return holiday;
	}
	/**
	 * @param holiday the holiday to set
	 */
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return String.format("First name : %1$s, Last name : %2$s, Birthday : %3$s\nSalary : %4$s, Holiday : %5$s, Year : %6$s", 
				getFirtName(), getLastName(), getBirthday(), getSalary(), getHoliday(), getYear());
	}
}
