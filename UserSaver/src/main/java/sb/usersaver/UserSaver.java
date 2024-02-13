/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sb.usersaver;

import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class UserSaver {
    
//    private static String firstname;
//    private static String lastname;
//    private static String username;
//    private static String password;

    public static void main(String[] args) throws SQLException {
        if(args.length == 0 || args.length < 4){
            System.err.printf("No user information! example: java -jar UserSaverVersionNumber.jar arg1 arg2 arg3 arg4");
        }else{
            System.out.printf("User information: \n%s\n%s\n%s\n%s\n", args[0],args[1],args[2],args[3]);
            JDBCUtils.insertUser(args[0],args[1],args[2],args[3]);   
        }     
        
    }
}
