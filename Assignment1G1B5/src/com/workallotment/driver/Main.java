package com.workallotment.driver;

import java.util.Scanner;

import com.workallotment.service.AdminDepartment;
import com.workallotment.service.HRDepartment;
import com.workallotment.service.TechDepartment;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		AdminDepartment ad = new AdminDepartment();
		HRDepartment hd = new HRDepartment();
		TechDepartment td = new TechDepartment();

		int choice;

		do {

			System.out.println("Choose your department:" + "\n1. Admin Department.");
			System.out.println("2. HR Department." + "\n3. Tech Department." + "\nO. Exit");
			choice = in.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Exit successful");
				//System.exit(0);
			case 1:
				ad.display();
				break;
			case 2:
				hd.display();
				break;
			case 3:
				td.display();
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}

		} while (choice != 0);

		in.close();

	}

}
