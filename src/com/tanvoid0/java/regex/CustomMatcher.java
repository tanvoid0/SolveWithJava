package com.tanvoid0.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMatcher {
  public static void main(String[] args) {
    final String regex = "(\\d{4}-\\d{2}-\\d{2})[A-Z]+(\\d{2}:\\d{2}:\\d{2}).([0-9+-:]+)";
    final String string = "2022-09-30T19:52:08.464317100+01:00[Europe/London]";
//    final String subst = "\\1 \\2 \\3";

    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(string);

// The substituted value will be contained in the result variable
    final boolean result = matcher.find();

    System.out.println("Substitution result: " + result);
  }
}
