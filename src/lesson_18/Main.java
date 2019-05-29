package lesson_18;

import java.sql.*;

public class Main {
    public static final String jdbc = "jdbc:mysql:";
    public static final String hostAndPort = "//localhost:3306";
    public static final String url = "/address_book";
    public static final String unicode = "useUnicode=true";
    public static final String jdbcTimezoneShift = "useJDBCCompliantTimezoneShift=true";
    public static final String dateTime = "useLegacyDatetimeCode=false";
    public static final String serverTimeZone = "serverTimezone=UTC";
    public static final String separator = "?";
    public static final String separatorAnd = "&";
    public static final String fullUrl =
            jdbc
                    + hostAndPort
                    + url
                    + separator
                    + unicode
                    + separatorAnd
                    + jdbcTimezoneShift
                    + separatorAnd
                    + dateTime
                    + separatorAnd
                    + serverTimeZone;
    public static final String USER_NAME = "root";
    public static final String password = "root";
    public static final String insertPerson = "insert into person (name,age) VALUES (?,?)";


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(fullUrl, USER_NAME, password);

        Statement statement = connection.createStatement();
//        statement.execute("create table if not exists person(" +
//                "id int primary key auto_increment," +
//                "name varchar(255)," +
//                "merried boolean default false)");

//        statement.execute("insert into person (id,name,merried) value (2,'Timmy',false)");
//        statement.execute("update person set name='Karl',merried=true where id=2");
//        statement.execute("delete from person where name='Timmy'");
//        statement.execute("alter table person add age int");
//        PreparedStatement preparedStatement = connection.prepareStatement(
//                "insert into person (name,merried,age) value (?,?,?)");
//        preparedStatement.setString(1,"Slava");
//        preparedStatement.setBoolean(2, false);
//        preparedStatement.setInt(3, 25);
//        preparedStatement.execute();
        connection.setAutoCommit(false);
        statement.execute("select * from person");
        connection.commit();

        ResultSet set = statement.getResultSet();
        while (set.next()) {
            System.out.println(
                    "id: " + set.getInt(1) +
                            " name: " + set.getString(2) +
                            " merried: " + set.getBoolean(3) +
                            " age: " + set.getInt(4));
        }


        statement.close();
        connection.close();
    }

//        try (Connection connection = DriverManager.getConnection(fullUrl, USER_NAME, password)) {
//            connection.setAutoCommit(false);
//            Statement statement = connection.createStatement();
//            statement.execute("DROP TABLE if exists person");
//            statement.execute("CREATE TABLE if not exists person  (" +
//                    "id int primary key auto_increment," +
//                    "name varchar(255)," +
//                    "age int(255)" +
//                    ")");
//            statement.execute("insert into person (name,age) values ('Andry',12)");
//            PreparedStatement preparedStatement = connection.prepareStatement(
//                    insertPerson);
//            preparedStatement.setString(1, "Candy");
//            preparedStatement.setInt(2, 15);
//            preparedStatement.addBatch();
//            preparedStatement.execute();
//            preparedStatement.setString(1, "Arkadii");
//            preparedStatement.setInt(2, 17);
//            preparedStatement.addBatch();
//            preparedStatement.execute();
//
//            preparedStatement.setString(1, "Enakentii");
//            preparedStatement.setInt(2, 13);
//            preparedStatement.addBatch();
//            preparedStatement.execute();
//            connection.commit();
//            preparedStatement = connection.prepareStatement("update person set name := ?,age :=? where id =?");
//            preparedStatement.setString(1, "Genadii");
//            preparedStatement.setInt(2, 11);
//            preparedStatement.setInt(3, 1);
//
//            preparedStatement.execute();
//
//
//            statement.execute("delete from person where id=1");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
}
