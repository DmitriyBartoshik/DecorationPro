package com.epam.model.entity.decor.enums;

public enum DecorateOrigin {
    SYNTHETIC("synthetic"), NATURAL("natural");

    private String title;

    DecorateOrigin(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
