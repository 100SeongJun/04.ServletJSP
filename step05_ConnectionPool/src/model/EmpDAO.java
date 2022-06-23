package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;

public class EmpDAO {
//	public static EmpDTO 
	public static String getName(int empno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select ENAME  from emp where EMPNO= ?");
			pstmt.setInt(1, empno);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				return rset.getString(1);
			}
		} finally {
			DBUtil.close(rset, pstmt, con);
		}
		return null;
	}
}
