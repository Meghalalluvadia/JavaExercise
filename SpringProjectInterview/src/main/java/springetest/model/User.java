package springetest.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	
	
	
	private Integer Syr;
	private Integer Campus;
	private Integer StudentID;
	private Integer EntryDate;
	private Integer GradeLevel;
	private String Name;
	
	public Integer getSchoolYR()
	{
		return Syr;
	}
	public void setSchoolYR(Integer syr)
	{
		this.Syr=syr;
	}
	
	
	public Integer getCampus()
	{
		return Campus;
	}
	public void setCampus(Integer Campus)
	{
		this.Campus=Campus;
	}
	
	public Integer getStudentID()
	{
		return StudentID;
	}
	public void setStudentId(Integer StudentID)
	{
		this.StudentID= StudentID;
	}
	
	public Integer getEntryDate()
	{
		return EntryDate;
	}
	public void setEntryDate(Integer EntryDate)
	{
		this.Syr=EntryDate;
	}
	
	public Integer getGradeLevel()
	{
		return GradeLevel;
	}
	public void setGradeLevel(Integer GradeLevel)
	{
		this.Syr=GradeLevel;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	}
	
