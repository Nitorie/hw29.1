package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String url = "https://rozetka.com.ua/185160249/p185160249/";

        try {
            Document doc = Jsoup.connect(url).get();

            Elements headings = doc.select(".value .ng-star-inserted");

            Element heading = headings.first();
            if (heading != null) {
                System.out.println(heading.text());
            } else {
                System.out.println("Element not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}