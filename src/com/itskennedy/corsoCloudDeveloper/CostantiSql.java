package com.itskennedy.corsoCloudDeveloper;

public interface CostantiSql {

	public String nomeDriver = "com.mysql.cj.jdbc.Driver";

	public String urlSchool = "jdbc:mysql://localhost:3306/school"; // --> agire nel db school
	public String urlCompany = "jdbc:mysql://localhost:3306/company"; // --> agire nel db school
	public String user = "root";
	public String password = "Vmware1!";

	
	public String nomeDriver_postgres = "org.postgresql.Driver";

	public String urlSchool_postgres = "jdbc:postgresql://localhost:5432/school"; // --> agire nel db school
	public String urlCompany_postgres = "jdbc:postgresql://localhost:5432/company"; // --> agire nel db school
	public String user_postgres = "school";
	public String password_postgres = "school";

}
