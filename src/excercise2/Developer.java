package excercise2;

public class Developer extends Employee {
	private String comment;
	
	public Developer(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return String.format("Name : %1$s %2$s, Comment : %3$s, Salary : %4$s", 
				getFirtName(),getLastName(),this.comment,getSalary());
	}
}
