/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqldatabase.Sqldatabaseedu.lfa.jdbc;

import java.sql.*;
import java.util.*;

/**
 *
 * @author samyam
 */
public class Controller {

    Scanner input = new Scanner(System.in);
    controller_elements var = new controller_elements();

    void main() {
        try {
            while (true) {
                var.menu();
                int choice;
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        var.case1();
                        break;
                    case 2:
                        var.case2();
                        break;
                    case 3:
                        var.case3();
                        break;
                    case 4:
                        var.case4();
                        break;

                    case 5:
                        var.case5();
                        break;
                    default:
                        System.exit(0);

                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
