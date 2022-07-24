package Third_day_2;

class CollegeStudent extends Student
{
	String CollegeName;
	String Year;
	public void setName(String name)
	{
		super.setName(name);
	}
	public String getName()
	{
		return super.getName();
	}
	public int getStudentId() {
		return super.getStudentId();
	}
	public void setStudentId(int studentId) {
		super.setStudentId(studentId);
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
}
