package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.DeptDTO;
import util.DBUtil;

public class DeptDAO {
	public static DeptDTO getAll(int no) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DeptDTO deptAll = new DeptDTO();

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from dept where deptno=?");
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				deptAll.setDeptno(rset.getInt(1));
				deptAll.setdName(rset.getString(2));
				deptAll.setLoc(rset.getString(3));
				return deptAll;
			}
		} finally {
			DBUtil.close(rset, pstmt, con);
		}
		return null;
	}
}
