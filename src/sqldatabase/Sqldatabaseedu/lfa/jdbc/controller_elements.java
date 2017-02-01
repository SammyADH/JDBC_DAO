/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqldatabase.Sqldatabaseedu.lfa.jdbc;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author samyam
 */
public class controller_elements {

    Scanner input = new Scanner(System.in);
    jdbc_interface jdbDAO = new jdbc_impl();
    Connection con;
    
    void menu() {
        System.out.println("* * * : JDBC Menu : * * *");
        System.out.println("1.Open Connection");
        System.out.println("2.Get by Categories");
        System.out.println("3.Get by Products");
        System.out.println("4.Delete entry");
        System.out.println("5.Close Connection");
        System.out.println("* * * * * * * * * * * * *");
        System.out.print("Enter your choice : ");
    }

    void case1() throws SQLException, ClassNotFoundException {
        Connection connect = jdbDAO.open_connection();
        System.out.println("Connection has been established.");
        con=connect;
    }

    void case2() throws SQLException, ClassNotFoundException {
        System.out.print("Enter Category Id :");
        int ch = input.nextInt();
        ResultSet check = jdbDAO.getbyCat_Id(ch,con);
        while (check.next()) {
            System.out.println(check.getString("name"));
        }
    }

    void case3() throws SQLException, ClassNotFoundException {
        System.out.print("Enter Product Id :");
        int id = input.nextInt();
        ResultSet checks = jdbDAO.getbyPrd_Id(id,con);
        while (checks.next()) {
            System.out.println(checks.getString("name"));
        }
    }

    void case4() throws SQLException, ClassNotFoundException {
        if (jdbDAO.delete() == true) {
            System.out.println("Deleted");
        } else {
            System.out.println("Entry not Found");
        }
    }

    void case5() throws SQLException, ClassNotFoundException {
        jdbDAO.close_connection(con);
        System.out.println("Connection has been terminated.");
    }
}
