package model;

public class StudentDTO {
	private int id;
	private String name;
	private int age;
	private String phone;
	private String addr;
	private String seatId;
	private int attendance;
	private int absent;
	private int managerID;

	public StudentDTO() {
	}

	// 학생 정보 출력
	public StudentDTO(int id, String name, int age, String phone, String addr, String seatId, int attendance,
			int absent, int managerID) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
		this.seatId = seatId;
		this.attendance = attendance;
		this.absent = absent;
		this.managerID = managerID;
	}

	// 학생추가
	public StudentDTO(String name, int age, String phone, String addr, String seatId, int managerID) {
		this.name = name;
		this.age = age;
		this.seatId = seatId;
		this.phone = phone;
		this.addr = addr;
		this.managerID = managerID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getAbsent() {
		return absent;
	}

	public void setAbsent(int absent) {
		this.absent = absent;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	@Override
	public String toString() {
		return "아이디:" + id + "\t이름:" + name + "\t나이:" + age + "\t전화번호:" + phone + "\t주소:" + addr + "\t좌석:" + seatId
				+ "\t지각:" + attendance + "\t결석:" + absent + "\t담당자번호:" + managerID;
	}
}
