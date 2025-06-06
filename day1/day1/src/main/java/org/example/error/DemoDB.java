package org.example.error;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


class MyDatabase implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Close MyDatabase");
    }

    public void process(){

    }
}

class Employee {
}

class Database {

    public List<Employee> getAll() {
        // Try-resources
        try (
                MyDatabase myDatabase = new MyDatabase();
                // AutoClosable
                Connection conn = DriverManager.getConnection("");
                PreparedStatement preparedStatement = conn.prepareStatement("");
                ResultSet rs = preparedStatement.executeQuery();
        ) {

            myDatabase.process();

            return null;
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return null;
    }
}

public class DemoDB {
    public static void main(String[] args) {
        new Database();
    }
}
