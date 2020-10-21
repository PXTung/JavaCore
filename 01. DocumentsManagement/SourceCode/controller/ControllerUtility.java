package controller;

import module.document.*;
import module.person.*;
import module.management.*;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerUtility {
	public ArrayList<Book> findBook(
			String bookName, ArrayList<Book> books){
		var result = new ArrayList<Book>();

		for (var b : books){
			Matcher matcher = Pattern.compile(bookName.toLowerCase()).
					matcher(b.getDocName().toLowerCase());
			if (matcher.find())
				result.add(b);
		}
		return result;
	}

	public ArrayList<Reader> findReader(
			String readName, ArrayList<Reader> readers) {
		var result = new ArrayList<Reader>();
		for (var r : readers){
			Matcher matcher = Pattern.compile(readName.toLowerCase()).
					matcher(r.getFullName().toLowerCase());
			if (matcher.find())
				result.add(r);
		}
		return result;
	}

    public ArrayList<Employee> finEmployee(
    		String empName, ArrayList<Employee> employees) {
		var result = new ArrayList<Employee>();
		for (var e : employees){
			Matcher matcher = Pattern.compile(empName.toLowerCase()).
					matcher(e.getFullName().toLowerCase());
			if (matcher.find())
				result.add(e);
		}
		return result;
    }
}