package ru.otus.homework13;

public enum TypeOfTerrain {
    forest ("лес"), plain ("равнина"), swamp ("болото");
    private String title;
    TypeOfTerrain(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}