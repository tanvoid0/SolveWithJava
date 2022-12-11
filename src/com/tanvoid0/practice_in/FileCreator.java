package com.tanvoid0.practice_in;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCreator {
  private static final Scanner scan = new Scanner(System.in);

  public static void main(String args[]) throws Exception {
    String filename = "hosts_access_log_00.txt";
//    filename = scan.nextLine();
    String content = readFile(filename);
    content = processData(content);
    writeFile(filename, content);
  }


  // Read file as List of Strings
  public static String readFile(String filename) {
    try {
      String content = new Scanner(new File(filename)).useDelimiter("\\Z").next();
      return content;
    } catch (Exception e) {
      return "";
    }
  }
  // Use regex pattern to extract content
  private static String processData(List<String> content) {
    StringBuilder result = new StringBuilder();
    for (String c: content) {
      result.append(processData(c));
    }
    return result.toString();
  }

  private static String processData(final String content) {
    Pattern pattern = Pattern.compile("(?:.(?!/))+.gif", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(content);
    StringBuilder result = new StringBuilder();
    while (matcher.find()) {
      result.append(matcher.group(0).toString().substring(1) + "\n");
    }
    return result.toString();
  }

  // Save file
  public static void writeFile(final String name, final String content) {
    try {
      FileWriter file = new FileWriter("gifs_" + name);
      file.write(content);
      file.close();
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }
}
// hosts_access_log_00.txt