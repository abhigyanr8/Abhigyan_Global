package Third_day_2;

class Teacher extends Person
{
	int salary;
	String subject;
	public void setName(String name)
	{
		super.setName(name);
	}
	public String getName()
	{
		return super.getName();
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}