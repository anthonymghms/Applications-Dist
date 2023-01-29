import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Cours";
        String userName = "root";
        String password = "";
        String query = "select * from catalogue;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection cx = DriverManager.getConnection(url,userName,password);
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("Name");
            int weight = rs.getInt("Weight");
            String color = rs.getString("Color");
            String price = rs.getString("Price");
            System.out.println("Name of product: " + name + ", weight: " + weight + ", color: " + color + ", et price: " + price + ".");
        }
        rs.close();
        st.close();
        cx.close();

    }
}
