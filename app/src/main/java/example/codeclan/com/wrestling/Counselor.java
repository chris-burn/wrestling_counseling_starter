package example.codeclan.com.wrestling;

import db.SqlRunner;

/**
 * Created by user on 26/06/2017.
 */

public class Counselor {

    private int id;
    private String first_name;
    private String nick_name;
    private String last_name;
    private String telephone;
    private String email;
    private String member_since;

    public Counselor(String first_name, String nick_name, String last_name, String telephone, String email, String member_since){
        this.first_name = first_name;
        this.nick_name = nick_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.member_since = member_since;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMember_since() {
        return member_since;
    }

    public void setMember_since(String member_since) {
        this.member_since = member_since;
    }

    public static void deleteAll(){
        String sql = "DELETE FROM counselors;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }




}


