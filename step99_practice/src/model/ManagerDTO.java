package model;

public class ManagerDTO {
	private int managerID; // 담당자 id
	private String managerName; // 담당자 이름
	private String managerPhone; // 담당자 연락처

	public ManagerDTO() {
	}

	public ManagerDTO(int managerID, String managerName, String managerPhone) {
		super();
		this.managerID = managerID;
		this.managerName = managerName;
		this.managerPhone = managerPhone;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	@Override
	public String toString() {

		return "담당자 ID:" + managerID + "\t담당자 이름:" + managerName + "\t담당자 전화번호:" + managerPhone;
	}

}
