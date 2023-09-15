package ru.otus.homework13;

public enum TypeOfTerrain {
    FOREST("лес"), PLAIN("равнина"), SWAMP("болото");
    private String title;
    TypeOfTerrain(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}