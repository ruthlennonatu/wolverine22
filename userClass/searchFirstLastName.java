// Secure function to find user - needs tested
public List<User> findUser(String firstName, String lastName) throws SQLException {
		
		List<User> list = new ArrayList<>();
		User user = new User(0, null, null);		
		String query = "SELECT * FROM database_activity.User WHERE firstname like %?% and lastname like %?%";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, String.valueOf(firstName));//       setString(1    
        statement.setString(2, String.valueOf(lastName)); //       setString(2
        ResultSet resultSet = statement.executeQuery();

		try {
			while(resultSet.next())
			user = new  User(Integer.parseInt(resultSet.getString("id")),resultSet.getString("firstname") , resultSet.getString("lastname"));
			    
                    list.add(user);
		    }
                  catch (SQLException e) 
                    {}
		return list;

	}
