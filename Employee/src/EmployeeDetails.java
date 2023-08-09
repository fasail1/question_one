import java.awt.geom.Arc2D.Double;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class EmployeeDetails {
private String Name;
	private String Position;
	private double Salary;
	private String Experience;
	private String EducationalLevel;
	private double netSalary;
	
	public EmployeeDetails(ResultSet resultSet) throws SQLException {
		  this.Name = resultSet.getString(1);
		  this.Position = resultSet.getString(2);
		  this.Salary = resultSet.getDouble(3);
		  this.Experience = resultSet.getString(4);
		  this.EducationalLevel = resultSet.getString(5);
		}
	
	      public String getName() {
		   return Name;
		  }
		  public void setName(String Name) {
		     this.Name = Name;
		  }
		  public String getPosition() {
			  return Position;
		  }
		  public void setPosition(String Position) {
			  this.Position = Position;
		  }
		  public double getSalary() {
			  return Salary;
		  }
			public void setSalary(double Salary) {
			  this.Salary = Salary;
		  }
		  public String getExperience() {
				  return Experience;
		  }
		  public void setExperience(String Experience) {
				  this.Experience = Experience;
		  }
		  public String getEducationalLevel() {
				  return EducationalLevel;
		  }
		  public void setEducationalLevel(String EducationalLevel) {
				this.EducationalLevel = EducationalLevel;
		  }
		 
		  
		  public void calculateNSalary(double rSalry){

		        rSalry = Salary * 5% * Experience;
		        netSalary = Salary-pfamount;
		  }
		  
		  if EducationalLevel500 & 250
		  else 0
}
