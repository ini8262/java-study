package com.example.pattern.strategy;

public class SearchButton {
    private SearchStrategy searchStrategy = new AllSearch();

    public void changeSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void onClick() {
        searchStrategy.onClick();
    }
}
