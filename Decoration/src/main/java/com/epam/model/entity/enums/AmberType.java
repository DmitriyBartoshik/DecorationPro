package com.epam.model.entity.decor.enums;

public enum AmberType {
    HEDANITE("hedanite"), HESSITE("hessite"), BAKERITE("bakerite");
    private String title;

    AmberType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    }
