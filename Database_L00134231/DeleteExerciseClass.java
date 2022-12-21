package net.sqlitetutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class DeleteExerciseClass {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "Needs Updated w/ URL";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Delete a Exercise Class by its ID
     *
     * @param id
     */
    public void delete(int id) {
        String sql = "DELETE FROM classes WHERE exerciseClass_id = ?";

        try (Connection conn = this.connect();
                PreparedStatement statement = conn.prepareStatement(sql)) {

            // set the corresponding param
            statement.setInt(1, id);
            // execute the delete statement
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

   

}
