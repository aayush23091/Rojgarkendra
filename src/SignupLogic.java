import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class SignupLogic {
    public static void signup(String username, String password) {
        try (Connection conn = dbconnect.getConnection()) {
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Signup Successful!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}

