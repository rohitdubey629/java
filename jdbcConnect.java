import java.sql.*;
import java.util.*;

public class jdbcConnect {
    static int roll, id;
    static String n, g, c;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Name\t Gender\t Course\t Roll Number\t Id");
            n = sc.nextLine();
            g = sc.nextLine();
            c = sc.nextLine();
            roll = sc.nextInt();
            id = sc.nextInt();
        }

        try {
            System.out.println("hii11");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("hii222");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "Rohit91Dubey");
            System.out.println("hii333");

            Statement stmt = con.createStatement();
            String SQL = "insert into student1(roll,id,name,grn,course)value(" + roll + "," + id + ",'" + n + "','" + g
                    + "','" + c + "')";
            System.out.println(SQL);
            System.out.println("hii");

            int x = stmt.executeUpdate(SQL);
            if (x > 0) {
                System.out.println("Record is Saved!!");
            } else {
                System.out.println("Error to Save!!");
            }
            con.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("byy");

            System.out.println("Error:" + e);
        }

    }
}
