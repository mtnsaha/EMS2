package com.employee.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {
    String dateFormat;

    public Test(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public boolean isValid(String dateString) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {
            {
                sdf.parse(dateString);
            }
        } catch (ParseException e) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Test test= new Test("dd-MM-yyyy");
        System.out.println(test.isValid("23-18-2020"));

    }
}