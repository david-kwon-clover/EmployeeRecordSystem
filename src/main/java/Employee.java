public class Employee {
  private int employeeId;
  private String name;
  private int age;
  private String jobTitle;
  private int salary;

  Employee(int employeeId, String name, int age, String jobTitle, int salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.age = age;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  public int getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
