package com.example.pattern.strategy;

public class AllSearch implements SearchStrategy {

    @Override
    public void onClick() {
        System.out.println("전체 검색");
    }
}
