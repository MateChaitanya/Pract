package com.app.dao;

import com.app.model.Student;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {

    private final String URL = "jdbc:mysql://localhost:3306/db1";
    private final String USER = "root";
    private final String PASS = "Chaitu@123";

    // INSERT
    public void insertStudent(Student s) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps =
                    con.prepareStatement("insert into student values(?,?,?)");

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());

            ps.executeUpdate();
            System.out.println("Student Inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW ALL
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps =
                    con.prepareStatement("select * from student");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age")
                );
                list.add(s);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void updateStudent(Student s) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps =
                    con.prepareStatement("update student set name=?, age=? where id=?");

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setInt(3, s.getId());

            ps.executeUpdate();
            System.out.println("Student Updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps =
                    con.prepareStatement("delete from student where id=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student Deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
