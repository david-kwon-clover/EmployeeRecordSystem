public class Manager extends Employee {
  private String department;

  public Manager(int employeeId, String name, int age, String jobTitle, int salary, String department) {
    super(employeeId, name, age, jobTitle, salary);
    this.department = department;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
