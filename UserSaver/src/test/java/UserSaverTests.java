/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sb.usersaver.JDBCUtils;
import sb.usersaver.UserSaver;

/**
 *
 * @author Jose
 */
public class UserSaverTests {
    
    @BeforeAll
    public static void setUpClass() throws SQLException {
        JDBCUtils.createTable();
        JDBCUtils.insertUser(User.USER1.firstname, User.USER1.lastname, User.USER1.username, User.USER1.password);
        JDBCUtils.insertUser(User.USER2.firstname, User.USER2.lastname, User.USER2.username, User.USER2.password);
        JDBCUtils.insertUser(User.USER3.firstname, User.USER3.lastname, User.USER3.username, User.USER3.password);
        JDBCUtils.insertUser(User.USER4.firstname, User.USER4.lastname, User.USER4.username, User.USER4.password);
        JDBCUtils.insertUser(User.USER5.firstname, User.USER5.lastname, User.USER5.username, User.USER5.password);
        JDBCUtils.insertUser(User.USER6.firstname, User.USER6.lastname, User.USER6.username, User.USER6.password);
        JDBCUtils.insertUser(User.USER7.firstname, User.USER7.lastname, User.USER7.username, User.USER7.password);
        JDBCUtils.insertUser(User.USER8.firstname, User.USER8.lastname, User.USER8.username, User.USER8.password);
        JDBCUtils.insertUser(User.USER9.firstname, User.USER9.lastname, User.USER9.username, User.USER9.password);
        JDBCUtils.insertUser(User.USER10.firstname, User.USER10.lastname, User.USER10.username, User.USER10.password);
        JDBCUtils.insertUser(User.USER11.firstname, User.USER11.lastname, User.USER11.username, User.USER11.password);
        JDBCUtils.insertUser(User.USER12.firstname, User.USER12.lastname, User.USER12.username, User.USER12.password);
        JDBCUtils.insertUser(User.USER13.firstname, User.USER13.lastname, User.USER13.username, User.USER13.password);
        JDBCUtils.insertUser(User.USER14.firstname, User.USER14.lastname, User.USER14.username, User.USER14.password);
        JDBCUtils.insertUser(User.USER15.firstname, User.USER15.lastname, User.USER15.username, User.USER15.password);
        JDBCUtils.insertUser(User.USER16.firstname, User.USER16.lastname, User.USER16.username, User.USER16.password);
        JDBCUtils.insertUser(User.USER17.firstname, User.USER17.lastname, User.USER17.username, User.USER17.password);
        JDBCUtils.insertUser(User.USER18.firstname, User.USER18.lastname, User.USER18.username, User.USER18.password);
        JDBCUtils.insertUser(User.USER19.firstname, User.USER19.lastname, User.USER19.username, User.USER19.password);
        JDBCUtils.insertUser(User.USER20.firstname, User.USER20.lastname, User.USER20.username, User.USER20.password);
        JDBCUtils.insertUser(User.USER21.firstname, User.USER21.lastname, User.USER21.username, User.USER21.password);
        JDBCUtils.insertUser(User.USER22.firstname, User.USER22.lastname, User.USER22.username, User.USER22.password);
        JDBCUtils.insertUser(User.USER23.firstname, User.USER23.lastname, User.USER23.username, User.USER23.password);
        JDBCUtils.insertUser(User.USER24.firstname, User.USER24.lastname, User.USER24.username, User.USER24.password);
        JDBCUtils.insertUser(User.USER25.firstname, User.USER25.lastname, User.USER25.username, User.USER25.password);
    }
    
    @AfterAll
    public static void tearDownClass() throws SQLException {
        JDBCUtils.dropUsers();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test1() throws SQLException {
         Assertions.assertEquals(JDBCUtils.selectArg(1), User.USER1.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(2), User.USER2.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(3), User.USER3.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(4), User.USER4.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(5), User.USER5.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(6), User.USER6.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(7), User.USER7.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(8), User.USER8.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(9), User.USER9.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(10), User.USER10.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(11), User.USER11.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(12), User.USER12.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(13), User.USER13.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(14), User.USER14.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(15), User.USER15.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(16), User.USER16.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(17), User.USER17.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(18), User.USER18.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(19), User.USER19.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(20), User.USER20.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(21), User.USER21.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(22), User.USER22.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(23), User.USER23.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(24), User.USER24.toString());
         Assertions.assertEquals(JDBCUtils.selectArg(25), User.USER25.toString());
     }
}
