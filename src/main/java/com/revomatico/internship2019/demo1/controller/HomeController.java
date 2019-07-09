package com.revomatico.internship2019.demo1.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @RequestMapping("/")
  public String home() {
    return "Events:<br/>" + table();
  }

  private String table() {
    List<List<String>> rows = new ArrayList<>();
    List<String> list= new ArrayList<>();
    rows.add(list);
    list.add("concert rock");
    list.add("2019-07-09 18:00");
    
    String result = "";
    for (List<String> row : rows) {
      result += row(row.get(0),row.get(1));
    }
    return tag("table", tag("tr", tag("th", "name") + tag("th", "date")) + result);
  }

  private String tag(String string, String result) {
    return tagAsHtml(string, result);
  }

  private String tagAsHtml(String tagName, String result) {
    return "<" + tagName + ">" + result + "</" + tagName + ">";
  }

  private String tagAsJson(String tagName, String result) {
    return "{\"" + tagName + "\":\"" + result + "\"}";
  }

  private String row(String name, String date) {
    return tag("tr", tag("td", name) + tag("td", date));
  }
}
