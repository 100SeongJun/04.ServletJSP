package model;

public class InstructorDTO {
	private int instructorID; // 강사 id
	private String instructorName; // 강사 이름
	private String instructorPhone; // 강사 연락처

	public InstructorDTO() {
	}

	public InstructorDTO(int instructorID, String instructorName, String instructorPhone) {
		super();
		this.instructorID = instructorID;
		this.instructorName = instructorName;
		this.instructorPhone = instructorPhone;
	}

	public int getInstructorId() {
		return instructorID;
	}

	public void setInstructorId(int instructorID) {
		this.instructorID = instructorID;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorPhone() {
		return instructorPhone;
	}

	public void setInstructorPhone(String instructorPhone) {
		this.instructorPhone = instructorPhone;
	}

	@Override
	public String toString() {

		return "강사 ID:" + instructorID + "\t강사이름:" + instructorName + "\t강사 연락처:" + instructorPhone;
	}

}
