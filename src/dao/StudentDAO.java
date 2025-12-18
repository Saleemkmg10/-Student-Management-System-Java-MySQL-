package dao;

import model.Student;
import util.DBConnection;
//import com.student.util.DBConnection;

import java.sql.*;

public class StudentDAO {

    // Add Student
    public void addStudent(Student student) {
        String sql = "INSERT INTO student(name, email, phone, course) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setString(4, student.getCourse());

            ps.executeUpdate();
            System.out.println("Student added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Students
    public void viewStudents() {
        String sql = "SELECT * FROM student";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("student_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getString("phone") + " | " +
                                rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Student
    public void updateStudent(int id, String course) {
        String sql = "UPDATE student SET course=? WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, course);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Student updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

