package com.example.pattern.strategy;

public class NewsSearch implements SearchStrategy {

    @Override
    public void onClick() {
        System.out.println("뉴스 검색");
    }
}
