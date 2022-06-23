package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBUtil;

public class StudentDAO {

	// 학생 정보 생성
	public static boolean addStudent(StudentDTO student) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(
					"insert into student(student_name,student_age,student_phone,student_addr,student_seatId,manager_manager_id) values(?,?,?,?,?,?)");
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getAddr());
			pstmt.setString(5, student.getSeatId());
			pstmt.setInt(6, student.getManagerID());
			int x = pstmt.executeUpdate();
			if (x == 1) {
				return true;
			}
		} finally {
			DBUtil.close(conn, pstmt);
		}
		return false;
	}

	// 학생 ID로 전화번호,주소 수정
	public static boolean updateStudent(int id, int selectNum, String modify) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			if (selectNum == 1) {
				pstmt = con.prepareStatement("update student set student_addr=? where student_id=? ");
				pstmt.setString(1, modify);
				pstmt.setInt(2, id);

			} else {
				pstmt = con.prepareStatement("update student set student_phone=? where student_id=? ");
				pstmt.setString(1, modify);
				pstmt.setInt(2, id);

			}
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 학생 정보 업데이트
	public static void updateAttendance(int id, int attendance) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			if (attendance == 1) { // 결석
				pstmt = con.prepareStatement(
						"update student set student_attendance = student_attendance+1 where student_id=?");
				pstmt.setInt(1, id);
			} else { // 지각
				pstmt = con.prepareStatement("update student set student_absent = student_absent+1 where student_id=?");
				pstmt.setInt(1, id);
			}
			pstmt.executeUpdate();
		} finally {
			DBUtil.close(con, pstmt);
		}
	}

	// 학생 ID로 학생 정보 삭제
	public static boolean deleteStudent(int studentId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from student where student_id=?");
			pstmt.setInt(1, studentId);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;

			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 학생 이름으로 학생 정보 검색
	public static StudentDTO getStudent(String name) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		StudentDTO studentInfo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from student where student_name=?");
			pstmt.setString(1, name);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				studentInfo = new StudentDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7), rset.getInt(8), rset.getInt(9));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return studentInfo;
	}

	// 모든 학생 검색
	public static ArrayList<StudentDTO> getAllStudent() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<StudentDTO> allStudent = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from student");
			rset = pstmt.executeQuery();

			allStudent = new ArrayList<StudentDTO>();
			while (rset.next()) {
				allStudent.add(new StudentDTO(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4),
						rset.getString(5), rset.getString(6), rset.getInt(7), rset.getInt(8), rset.getInt(9)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return allStudent;
	}

	// 특정 학생에 대한 출결정보 검색
	public static ArrayList<Integer> getData(StudentDTO oneStudnet) throws SQLException, NullPointerException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Integer> attendance = new ArrayList<Integer>();
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select student_attendance,student_absent from student where student_name=?");
			pstmt.setString(1, oneStudnet.getName());
			rset = pstmt.executeQuery();
			if (rset.next()) {
				attendance.add(rset.getInt(1));
				attendance.add(rset.getInt(2));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return attendance;
	}
}