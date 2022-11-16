public addAdmin(int adminID, int adminName, double adminPassword) throws SQLException {
			if (findAdmin(adminID, adminName, adminPassword) = "False"){

		
		Admin newAdmin = new newAdmin(adminID, adminName, adminPassword);
		 
		String query = *ADD* TO database_activity.Admin WHERE adminID = %?% and adminName = %?% and adminPassword = %?%";
        	PreparedStatement statement = conn.prepareStatement(query);
        	statement.setString(1, String.valueOf(adminID));        
        	statement.setString(2, String.valueOf(adminName)); 
         statement.setString(3, String.valueOf(adminPassword)); 
        	runQuery = statement.executeQuery();

		try {
			
			add = new  Admin(Integer.parseInt(runQuery.setString("adminID")),runQuery.setString("adminName") , runQuery.getString("adminPassword"));

		    }
                  catch (SQLException e) 
                    {}
		return list;
}
		