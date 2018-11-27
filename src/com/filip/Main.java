package com.filip;

public class Main {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addPropertyChangeListener(observer);

        observable.setNews("Morning news");
        System.out.println(observer.news);

        observable.setNews("Afternoon news");
        System.out.println(observer.news);

        observable.setNews("Evening news");
        System.out.println(observer.news);
    }
}
