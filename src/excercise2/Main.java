package excercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = getEmployeeList();
		List<Developer> developers = getDeveloperList();
		List<TeamLeader> teamLeaders = getTeamLeaderList();
		
		System.out.println("Employee List");
		employees.forEach((v) -> System.out.println(v.getLabel()));
		System.out.println("Developer List");
		developers.forEach((v) -> System.out.println(v.getLabel()));
		System.out.println("Team Leader List");
		teamLeaders.forEach((v) -> System.out.println(v.getLabel()));
	}

	private static List<Employee> getEmployeeList(){
		Employee emp1 = new Employee();
		emp1.setFirtName("Me");
		emp1.setLastName("MOK");
		emp1.setBirthday( "19/09/1999");
		emp1.setSalary(1000);
		emp1.setHoliday("Sat-Sun");
		emp1.setYear(5);
		Employee emp2 = new Employee();
		emp2.setFirtName("Bo");
		emp2.setLastName("Pisey");
		emp2.setBirthday( "17/07/1997");
		emp2.setSalary(1200);
		emp2.setHoliday("Sat-Sun");
		emp2.setYear(6);
		Employee emp3 = new Employee();
		emp3.setFirtName("Ya");
		emp3.setLastName("Riya");
		emp3.setBirthday( "08/08/1998");
		emp3.setSalary(1200);
		emp3.setHoliday("Sat-Sun");
		emp3.setYear(6);
		
		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3));
		return employeeList;
	}
	
	private static List<Developer> getDeveloperList(){
		Developer dev1 = new Developer("Php Dev");
		dev1.setFirtName("Ip");
		dev1.setLastName("Id");
		dev1.setSalary(1500);
		Developer dev2 = new Developer("Phyton Dev");
		dev2.setFirtName("ID");
		dev2.setLastName("JO");
		dev2.setSalary(2500);
		
		List<Developer> developerList = new ArrayList<Developer>(Arrays.asList(dev1,dev2));
		return developerList;
	}
	
	private static List<TeamLeader> getTeamLeaderList(){
		TeamLeader team1 = new TeamLeader();
		team1.setFirtName("Hy");
		team1.setLastName("Ban");
		team1.setProjectNum(100);
		TeamLeader team2 = new TeamLeader();
		team2.setFirtName("RE");
		team2.setLastName("ITO");
		team2.setProjectNum(80);
		
		List<TeamLeader> teamLeaderList = new ArrayList<TeamLeader>(Arrays.asList(team1,team2));
		return teamLeaderList;
	}

}
