package db_course_design;

import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBHandler {
    private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;DatabaseName=ResearchArchive;encrypt=true;trustServerCertificate=true";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "p-0p-0";
    private static final Logger logger = LoggerFactory.getLogger(DBHandler.class);


    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        logger.info("Start connecting to the database");

        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection established");
        } catch (Exception e) {
            logger.error("Connection failed", e);
        }
    }
}
