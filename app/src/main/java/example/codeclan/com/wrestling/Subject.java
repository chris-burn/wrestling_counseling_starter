package example.codeclan.com.wrestling;

import java.sql.ResultSet;

import db.SqlRunner;

/**
 * Created by user on 26/06/2017.
 */

public class Subject {

    private int id;
    private String name;
    private String description;
    private int counselor_id;

    public Subject(String name, String description, int counselor_id){
        this.name = name;
        this.description = description;
        this.counselor_id = counselor_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCounselor_id() {
        return counselor_id;
    }

    public void setCounselor_id(int counselor_id) {
        this.counselor_id = counselor_id;
    }

    public static void deleteAll(){
        String sql = "DELETE FROM subjects;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void displayIdName(){
        String sql = "SELECT id, name FROM subjects;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try{
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println();
            }
        } catch (Exception ex){
            System.exit(0);
        }   finally {
            SqlRunner.closeConnection();
        }
    }

    public static void getMoreDetails(int chosen_id){
        String sql = String.format("SELECT subjects.description, counselors.first_name, counselors.nick_name, counselors.last_name, counselors.member_since, counselors.email, counselors.telephone " +
                "FROM subjects JOIN counselors ON counselors.id = subjects.counselor_id WHERE subjects.id = %d;", chosen_id);
        ResultSet rs = SqlRunner.executeQuery(sql);
        try{
            while(rs.next()){
                String description = rs.getString("description");
                String first_name = rs.getString("first_name");
                String nick_name = rs.getString("nick_name");
                String last_name = rs.getString("last_name");
                String member_since = rs.getString("member_since");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                System.out.println("Description: " + description);
                System.out.println("Name: " + first_name + nick_name + last_name);
                System.out.println("Member Since: " + member_since);
                System.out.println("Email: " + email);
                System.out.println("Telephone: " + telephone);
            }
        } catch (Exception ex){
            System.exit(0);
        } finally {
            SqlRunner.closeConnection();
        }
    }

}
