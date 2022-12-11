package com.tanvoid0.practice_in;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println(topArticles(2));
  }

  public static HttpURLConnection conn;

  public static List<String> topArticles(int limit) {
    final String uri = "https://jsonmock.hackerrank.com/api/articles";
    // HTTP Request
    final String response = getRequest(uri, String.valueOf(limit));
    if (response == null) return null;

    // Convert String to Object
    List<Article> articles = processData(response);

    // Custom Sort data
    articles = customSort(articles);
    System.out.println(articles.size());

    // Return list with limited data...
    return articles.stream().limit(limit).map(Article::getTitle).collect(Collectors.toList());
  }

  /**
   * Get Request to return String response
   * @param uri
   */
  private static String getRequest(final String uri, final String limit) {
    BufferedReader reader;
    String line;
    StringBuilder responseContent = new StringBuilder();
    String response = null;
    try {
      URL url = new URL(uri);
      conn = (HttpURLConnection) url.openConnection();

      // Request setup
      conn.setRequestMethod("GET");
      conn.setConnectTimeout(5000);// 5000 milliseconds = 5 seconds
      conn.setReadTimeout(5000);
//      conn.setRequestProperty("Pagination-Count", limit);
//      conn.setRequestProperty("", "");
      conn.setRequestProperty("X-Total-Count", limit);

      // Test if the response from the server is successful
      int status = conn.getResponseCode();

      // Handle Error response
      if (status >= 300) {
        reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        while ((line = reader.readLine()) != null) {
          responseContent.append(line);
        }
        reader.close();
      }

      // Success response
      else {
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((line = reader.readLine()) != null) {
          responseContent.append(line);
        }
        reader.close();
      }
      response = responseContent.toString();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
//      e.printStackTrace();
    } finally {
      conn.disconnect();
      return response;
    }
  }

  /**
   * Process raw string data to VO
   * @param content
   * @return listOfVO
   */
  static List<Article> processData(String content) {
    List<String> titles = titleRegex("title", content);
    List<String> story_titles = titleRegex("story_title", content);
    List<String> comments = titleRegex("num_comments", content);
    List<Article> articles = new ArrayList<>();
    for (int i = 0; i < titles.size() && i < story_titles.size() && i < comments.size(); i++) {
      // Avoid articles with empty titles
      if (titles.get(i).equals("null") && story_titles.get(i).equals("null")) {
        continue;
      }

      // create vo with appropriate title
      Article article = new Article(titles.get(i), story_titles.get(i), comments.get(i));

      articles.add(article);
    }
    return articles;
  }

  /**
   * Custom sort using comparator
   * 1. Number of comments in decreasing order
   * 2. Titles decreasing order
   *
   * @param articles
   * @return sorted list
   */
  static List<Article> customSort(final List<Article> articles) {
    articles.sort(Comparator.comparing(Article::getNum_comments).reversed().thenComparing(Article::getTitle));
    return articles;
  }

  // Extract value for key from String using regular expression
  static List<String> titleRegex(String key, String str) {
    Pattern pattern = Pattern.compile(String.format(".%s\".*?\"(.*?)\"", key));
    Matcher matcher = pattern.matcher(str);
    final List<String> strings = new ArrayList<>();
    while (matcher.find()) {
      // Remove key titles and quotes from string
      String rawString = matcher.group().toString();
      rawString = rawString.split(",")[0];
      rawString = rawString.replace(String.format("\"%s\":", key), "").replace(String.format("_%s\":", key), "").replaceAll("\"", "");

      strings.add(rawString);
    }
    return strings;
  }
}

class Article {
  private String title;
  private Integer num_comments;

  public Article(String title, String story_title, String comments) {
    this.title = title.equals("null") ? story_title : title;
    this.num_comments = comments.equals("null") ? -1 : Integer.parseInt(comments);
  }

  // Overridden toString method for human readable vo
  @Override
  public String toString() {
    final String str = String.format("Title: %s num_comments: %d\n", title, num_comments);
//    System.out.printf(str);
    return str;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getNum_comments() {
    return num_comments;
  }

  public void setNum_comments(Integer num_comments) {
    this.num_comments = num_comments;
  }
}
