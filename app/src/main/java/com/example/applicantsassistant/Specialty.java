package com.example.applicantsassistant;

public class Specialty {
    private String name;
    private String description;
    private int image_id;

    public Specialty(String name, String description, int image_id) {
        this.name = name;
        this.description = description;
        this.image_id = image_id;
    }

    // Геттеры для получения данных
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return image_id;
    }
}
