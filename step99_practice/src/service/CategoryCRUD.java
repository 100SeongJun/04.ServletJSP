package service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstructorDAO;
import model.ManagerDAO;
import model.StudentDAO;

public class CategoryCRUD {

	public static String category(String cmd, String type, HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		if (type == null) {
			switch (cmd) {
			case "allData":
				return "getAll.jsp";
			case "remove":
				return "remove.jsp";
			case "update":
				return "update.jsp";
			case "search":
				return "selectSearch.jsp";
			default:
				return "error.jsp";
			}
		} else {
			switch (cmd) {
			case "allData":
				getAll(type, request, response);
				return "getAllPeople.jsp";
			case "remove":
//				remove(removeid, type, request, response, request);
				return "removePeople.jsp";
			}
		}
		return null;
	}

	public static String getAll(String type, HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		switch (type) {
		case "Student":
			request.setAttribute("allStudent", StudentDAO.getAllStudent());
			break;
		case "Instructor":
			request.setAttribute("allInstructor", InstructorDAO.getAllInstructor());
			break;
		case "Manager":
			request.setAttribute("allManager", ManagerDAO.getAllManager());
			break;
		}
		return null;
	}

	public static String remove(int id, String type, HttpServletRequest request, HttpServletResponse response) {
		return null;

	}

	public static String remove(String type, int id, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

}
