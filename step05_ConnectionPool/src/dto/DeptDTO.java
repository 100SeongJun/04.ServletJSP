package dto;

public class DeptDTO {
	private int deptno;
	private String dName;
	private String loc;

	public DeptDTO() {
	}

	public DeptDTO(int deptno, String dName, String loc) {
		this.deptno = deptno;
		this.dName = dName;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	};

}
