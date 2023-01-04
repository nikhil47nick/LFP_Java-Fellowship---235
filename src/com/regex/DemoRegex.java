package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        String fName = "Sourav";

//
        Pattern p = Pattern.compile(("^[A-Z]{1}[a-z]{1,}$"));
        Matcher matcher = p.matcher(fName);
//
//        boolean b = matcher.matches();

//
        boolean pattern = Pattern.matches("^[A-Z]{1}[a-z]{1,}$", fName);
        boolean mobilePattern = Pattern.matches("^[0-9]{2}\\s[7-9]{1}[0-9]{9}$", "91 7234567890");
    }
    }
