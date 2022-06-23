package service;

public class CategorynCRUD {

	public static String category(String cmd) {
		switch (cmd) {
		case "allData":
			return "getAllPeople.jsp";
		case "remove":
			return "remove.jsp";
		case "update":
			return "update.jsp";
		case "search":
			return "selectSearch.jsp";
		default:
			return "error.jsp";
		}
	}

}
