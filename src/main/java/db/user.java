package db;

import db.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class user {

    public int add(String name,int age,int old_age){
        Connection con =  JdbcUtil.getConnection();
        String sql="insert into t_user values(id,?,?,?)";
        int i =0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, old_age);
            i=ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(con!=null) con.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        return i;
    }

    public static void main(String[] args) {
        user user = new user();
        user.add("测试",11,77);
    }

}
