package com.example.pattern.strategy;


import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test1() {
        SearchButton searchButton = new SearchButton();

        searchButton.changeSearchStrategy(new MapSearch());
        searchButton.onClick();

        searchButton.changeSearchStrategy(new ImageSearch());
        searchButton.onClick();

        searchButton.changeSearchStrategy(new NewsSearch());
        searchButton.onClick();
    }
}
