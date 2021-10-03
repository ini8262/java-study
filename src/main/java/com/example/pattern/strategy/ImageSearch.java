package com.example.pattern.strategy;

public class ImageSearch implements SearchStrategy {

    @Override
    public void onClick() {
        System.out.println("이미지 검색");
    }
}
