package Third_day_2;

class Student extends Person
{
	int studentId;
	
	public void setName(String name)
	{
		super.setName(name);
	}
	public String getName()
	{
		return super.getName();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}