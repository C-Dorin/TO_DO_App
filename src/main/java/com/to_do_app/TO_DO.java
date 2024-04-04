package com.to_do_app;

public class TO_DO {
	public static void main(String[] args) {
		new MainApp();

		// Statement sqlSt;

		// =============================== //
		// String output;
		// ResultSet result;
		// String SQL = "select * from Student";
		// =============================== //

		// try {
		// Class.forName("com.mysql.jdbc.Driver");
		// String dbURL = "jdbc:mysql://localhost:3306/TO_DO_App";
		// Connection dbConnect = DriverManager.getConnection(dbURL, "root", "");
		// sqlSt = dbConnect.createStatement();

		// ========================================== //
		// result = sqlSt.executeQuery(SQL);

		// while (result.next() != false) {
		// output = result.getString("Nume") + " " + result.getString("Prenume");
		// System.out.println(output);
		// }
		// ========================================== //

		// sqlSt.close();

		// } catch (ClassNotFoundException e) {
		// Logger.getLogger(TO_DO.class.getName()).log(Level.SEVERE, null, e);
		// System.out.println("Class not found, check the JAR");
		// } catch (SQLException e) {
		// Logger.getLogger(TO_DO.class.getName()).log(Level.SEVERE, null, e);
		// System.out.println("SQL is BAD :)" + e.getMessage());
		// }
	}
}