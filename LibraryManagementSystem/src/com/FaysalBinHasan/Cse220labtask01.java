package com.FaysalBinHasan;
import java.util.Scanner;
public class Cse220labtask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		Bookrecords record = new Bookrecords();
		System.out.println("Enter 1 For Book Name," + "Enter 2 For Book Id," + "Enter 3 For Bookauthor,"
				+ "Enter 4 For Bookpublisher");
		while (k.hasNext()) {
			String data = k.nextLine();
			if (data.equals("1")) {
				System.out.println("Enter name");
				String n = k.nextLine();
				System.out.println("Enter id");
				String i = k.nextLine();
				System.out.println("Enter author");
				String a = k.nextLine();
				System.out.println("Enter publisher");
				String p = k.nextLine();
				record.Addrecord(n, i, a, p);
			} else if (data.equals("2")) {
				if (record.information == true) {
					record.printrecord();
				} else {
					System.out.println("no previous entry");
				}
			} else if (data.equals("3")) {
				if (record.information == true) {
					System.out.println("Enter A Id");
					record.DeleteRecord(k.nextLine());
				} else {
					System.out.println("no previous entry");
				}
			} else if (data.equals("4")) {
				if (record.information == true) {
					System.out.println("Enter A Id to edit or enter # to go back");
					record.EditRecord(k.nextLine());
				} else {
					System.out.println("no previous entry");
				}
			} else {
				System.out.println("invalid input");
			}
			System.out.println(":For Addrecord enter 1," + "For Printrecord enter 2," + "For Deleting Enter 3,"
					+ "For Editing Enter 4");
		}
	}
}
