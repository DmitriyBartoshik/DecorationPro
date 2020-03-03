package com.epam.model.entity.decor.enums;

public enum PearlsType {
    BAROQUE("baroque"), BLISTER("blister"), SOUFFLE("souffle");
    private String title;

    PearlsType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
