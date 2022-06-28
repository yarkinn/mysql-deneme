import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        try {
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "admin" , "admin");
            Statement statement = myCon.createStatement();
            ResultSet set = statement.getResultSet();
            while( set.next()){
                System.out.println(set.getString("id") + ", " + set.getString("name"));
            }
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
