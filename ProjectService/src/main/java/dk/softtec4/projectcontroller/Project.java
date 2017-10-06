package dk.softtec4.projectcontroller;

import org.joda.time.DateTime;

public class Project {

	private String name;
	private DateTime created;
	private DateTime starteDate;
	private DateTime endDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DateTime getCreated() {
		return created;
	}
	public void setCreated(DateTime created) {
		this.created = created;
	}
	public DateTime getStarteDate() {
		return starteDate;
	}
	public void setStarteDate(DateTime starteDate) {
		this.starteDate = starteDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}
