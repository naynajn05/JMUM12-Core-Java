//Program to demonstrate Statement Interface
package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		//StatementInterfaceDemo.addEmployee(2, "Nikki", 56000);)
		System.out.println(StatementInterfaceDemo.updateEmpName(1, "Neha"));
		StatementInterfaceDemo.updateEmpSalary(1, 65000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(5);
		StatementInterfaceDemo.deleteEmp(3);
		//StatementInterfaceDemo.deleteEmp(6);
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();

	}

}
