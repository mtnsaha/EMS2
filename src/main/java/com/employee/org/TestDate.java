package com.employee.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate {
    String dateFormat;

    public TestDate(String dateFormat) {
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

        TestDate test= new TestDate("dd-MM-yyyy");
        System.out.println(test.isValid("29-02-2021"));

    }
}